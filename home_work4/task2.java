package home_work4;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;


/*
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами: 
 *      enqueue() - помещает элемент в конец очереди, 
 *      dequeue() - возвращает первый элемент из очереди и удаляет его, 
 *      first() - возвращает первый элемент из очереди, не удаляя.
*/

public class task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        // System.out.println(item);
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]

        queue.add(6666);
        
        enqueue(queue);
        System.out.println(queue);

        dequeue(queue);
        System.out.println(queue);

        first(queue);
        System.out.println(queue);
    }


    private static Queue first(Queue queue) {
        System.out.println(queue.peek());
        return queue;
    }

    private static Queue dequeue(Queue queue) {
        System.out.println(queue.poll());
        return queue;
    }

    private static Queue enqueue(Queue queue) {
        queue.add(null);
        // queue.add(queue);
        return queue;
    }
        
}