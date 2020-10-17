package Map;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class Student {
    String firstname;
    String lastname;
    String mainLanguage;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public Student(String firstname, String lastname, String mainLanguage) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mainLanguage = mainLanguage;
    }
    public String studentDetails(){
        return getFirstname() + " "+ getLastname() +" " + getMainLanguage()+ " - ";
    }
}
