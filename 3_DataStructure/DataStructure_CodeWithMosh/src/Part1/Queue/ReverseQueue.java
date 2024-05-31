package Part1.Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public  Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        return queue;
    }
}
