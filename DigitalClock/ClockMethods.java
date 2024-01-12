package DigitalClock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockMethods extends Thread {

    private ClockFrame frame;

    private SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

    public ClockMethods(ClockFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            String timeNow = timeFormat.format(Calendar.getInstance().getTime());
            frame.time.setText(timeNow);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}