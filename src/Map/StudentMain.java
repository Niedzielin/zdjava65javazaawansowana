/*
package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

*/
/**
 * Created by Hyperbook on 10/11/2020
 **//*

public class StudentMain {
    public static void main(String[] args) {

        Map<Student, List<Integer>> mapStudentToDegrees = new HashMap<>();
        Student student = new Student("Piotr","Niedzielin","PL");
        Student student2 = new Student("Adam","Janicki","PL");
        Student student3 = new Student("Kamila","Komor","PL");
        List<Integer> rating = Arrays.asList(5,3,2,6,1);
        List<Integer> rating2 = Arrays.asList(5,3,2,6,1);
        List<Integer> rating3 = Arrays.asList(5,3,2,6,1);
        mapStudentToDegrees.put(student,rating);
        mapStudentToDegrees.put(student2,rating2);
        mapStudentToDegrees.put(student3,rating3);
        System.out.println(student.studentDetails()+mapStudentToDegrees.get(student)+" "+ new StudentService);
        System.out.println(student2.studentDetails()+mapStudentToDegrees.get(student2));
        System.out.println(student3.studentDetails()+mapStudentToDegrees.get(student3));
    }
}
class StudentService{
    public double calculateAvrage(List<Integer> grades){
        Integer sum = 0;
        if(!grades.isEmpty()){
            for (Integer grade : grades){
                sum+=grade;
            }
            return sum.doubleValue()/grades.size();
        }
        return sum;
    }
}*/
