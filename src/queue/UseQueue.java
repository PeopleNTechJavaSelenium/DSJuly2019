package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aroz");
        queue.add("Rifath");
        queue.add("Farzana");

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

    }
}
