package zadanie2;

import java.time.LocalDate;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        Meeting meeting1 = new Meeting("Spotkanie na temat obiektowośći", "Lodz, powstancow 13");
        Meeting meeting2 =new Meeting("Jak AI wpływa na świat", currentDate,"Gdańsk Lęborska 35",30);
        meeting2.setSize(32);
        meeting2.meetingDescription();

        System.out.println(meeting2.delayMeeting(2));
    }
}
