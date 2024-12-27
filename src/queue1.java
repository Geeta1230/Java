/* queueexample

import java.util.LinkedList;
import java.util.Queue;
public class queue1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("cherry");
        System.out.println("Removed element:"+queue.poll());
        System.out.println("Front element:"+queue.peek());
        queue.offer("chikku");
        queue.offer("apple");
        System.out.println(queue);

    }
}
*/


/*  Arraydequeue
import java.util.ArrayDeque;
import java.util.Queue;
public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(3);
        queue.offer(8);
        queue.offer(4);
        System.out.println("Removed element:"+queue.poll());
        System.out.println("Front element:"+queue.peek());
        queue.offer(1);
        queue.offer(12);
        System.out.println(queue);

    }
}
*/


//priorityqueue example
import java.util.PriorityQueue;
import java.util.Queue;
public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(8);
        queue.offer(4);
        System.out.println("Removed element:"+queue.poll());
        System.out.println("Front element:"+queue.peek());
        queue.offer(1);
        queue.peek();
        queue.remove(1);
        System.out.println(queue);

    }
}
