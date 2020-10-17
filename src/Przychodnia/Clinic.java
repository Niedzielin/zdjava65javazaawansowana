package Przychodnia;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class Clinic {

    private String Patient;
    public Queue<String> patients=new ArrayDeque();
    public String registerPatient(String patientName){
        patients.offer(patientName);
        return patientName;
    }
    public String handlePatient(){
        return patients.poll();
    }
}
