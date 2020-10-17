package zadaniex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1= new ArrayList();
        for (int i = 0; i < 20; i++) {
            lista1.add((int) (Math.random()*10)+ 1);
            System.out.print(lista1.get(i)+" ");
        }

        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i)%2==0){
                lista1.remove(i);
                i--;
            }
        }
        System.out.println();
        for (int i = 0; i <lista1.size(); i++) {
            System.out.print(lista1.get(i)+" ");

        }

    }}
