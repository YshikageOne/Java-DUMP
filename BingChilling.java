package test;

import java.util.Scanner;

public class BingChilling {

    public static void main(String[] args) {

        String q1 = "How long is my penis?\n" + "(a)10 inches\n(b)1 inches\n(c) 0.1 inches\n";

        String q2 = "__ I'm Gay\n" + "(a)Yes\n(b)No\n(c)Maybe\n";

        String q3 = "Ra_ist\n" + "(a) c\n(b)p\n(c)No\n";

        Question [] questions = {
                new Question(q1, "c"),
                new Question(q2, "a"),
                new Question(q3, "c")
        };
        takeTest(questions);


    }

    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner mywifeleftme = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

        System.out.println(questions[i].prompt);
        String answer = mywifeleftme.nextLine();

        if(answer.equals(questions[i].answer)) {
            score++;
          }
        }

        System.out.println("Final Score lol\n" + "You got " + score + "/" + questions.length);
    }

} 
