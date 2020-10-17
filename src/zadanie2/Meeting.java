package zadanie2;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Hyperbook on 10/10/2020
 **/
public class Meeting {
    String description;
    LocalDate date;
    String adress;
    int size =18;

    public Meeting(String description, LocalDate date, String adress, int size) {
        this.description = description;
        this.date = date;
        this.adress = adress;
        this.size = size;
    }

    public Meeting(String description, String adress) {
        this.description = description;
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void meetingDescription(){
        System.out.println(description);
    }
    public LocalDate delayMeeting(int days){

        return date.plusDays(days);
    }
}
