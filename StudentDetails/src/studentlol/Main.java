package studentlol;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.FileHandler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

private static final Scanner bruh = new Scanner(System.in);
private static final String jsonFile = "studentList.json";
private static JSONArray studentList = new JSONArray();

	public static void main(String[] args) {
		System.out.println("[A]dd Student");
		System.out.println("[D]elete Student");
		System.out.println("[V]iew Student");
		
		System.out.print("Enter an option above: ");
		char userOption = bruh.next().charAt(0);
		
		studentList = loadStudentList();
		
		if(userOption == 'A') {
			addStudent();
		} 
		else if (userOption == 'D') {
			deleteStudent();
			saveStudentList(studentList);
		}
		else if (userOption == 'V') {
			viewStudent();
		}
		else {
			System.out.println("Error");
		}
	}
	
	private static void saveStudentList(JSONArray studentList) {
		try (FileWriter file = new FileWriter(jsonFile)){
			file.write(studentList.toJSONString());
		}
		catch(IOException e) {
			System.out.println("error" + e.getMessage());
		}
	}
	
	private static JSONArray loadStudentList() {
		try {
			String jsonLoad = new String(Files.readAllBytes(Paths.get(jsonFile)));
			return (JSONArray) new JSONParser().parse(jsonLoad);
		}
		catch(IOException | ParseException e) {
			return new JSONArray();
		}
	}
	
	private static void addStudent() {
		JSONObject newStudent = new JSONObject();
		
		System.out.print("Enter Student ID: ");
		int id = bruh.nextInt();
		
		System.out.print("Enter First Name: ");
		String firstName = bruh.next();
		
		System.out.print("Enter Last Name: ");
		String lastName = bruh.next();
		
		System.out.print("Enter Birthday: ");
		int birthday = bruh.nextInt();
		
		System.out.print("Enter Course: ");
		String course = bruh.next();
		
		JSONObject student = new JSONObject();
		newStudent.put("id",id);
		newStudent.put("firstName",firstName);
		newStudent.put("lastName",lastName);
		newStudent.put("birthday",birthday);
		newStudent.put("course",course);
		
		studentList.add(newStudent);
		saveStudentList(studentList);
		System.out.print("Student added successfully");
	}
	
	//amogus :) ඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞ
	
	private static void viewStudent() {
		System.out.print("Enter student id to view: ");
		int viewId = bruh.nextInt();
		
		for(int i = 0; i< studentList.size(); i++) {
			JSONObject student = (JSONObject) studentList.get(i);
			int studentId = ((Long) student.get("id")).intValue();
			
			if(studentId == viewId) {
				System.out.println("----------------------------------------");
				System.out.println("First Name: " + student.get("firstName"));
				System.out.println("Birthday: " + student.get("birthday"));
				System.out.println("ID: " + student.get("id"));
				System.out.println("Last Name: " + student.get("lastName"));
				System.out.println("Course: " + student.get("course"));
				System.out.println("----------------------------------------");
				return;
			}
		}
		
		System.out.println("student not found");
	}
	
	private static void deleteStudent() {
		System.out.print("Enter student id to view: ");
		int delId = bruh.nextInt();
		
		for(int i = 0; i < studentList.size();i++) {
			JSONObject student = (JSONObject) studentList.get(i);
			int studentId = ((Long) student.get("id")).intValue();
			
			if(studentId == delId) {
				studentList.remove(i);
				System.out.println(student.get("firstName") + " is removed from the list.");
				return;
			}
		}
		System.out.println("student not found");
	}
}
	
