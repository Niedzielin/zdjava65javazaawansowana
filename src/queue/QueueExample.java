package queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Ala");
        queue.offer("Doda");
        queue.offer("Adam");
        System.out.println("Pierwszy obsłużony zostanie : " +queue.peek());
        queue.remove("Doda");
        System.out.println("Obslugujemy wlasnie : " +queue.poll());
        System.out.println("Teraz zostanie obsłużony : " + queue.peek());

    }
}