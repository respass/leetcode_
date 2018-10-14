package interview;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: respass
 * @Date: 2018
 */
public class TwoQueueImplStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();


    public void push(Integer ele) {
        if (queue1.isEmpty() && queue2.isEmpty() ) {
            queue1.add(ele);
            return;
        }

        if (queue1.isEmpty()) {
            queue2.add(ele);
            return;
        }

        if (queue2.isEmpty()) {
            queue1.add(ele);
            return;
        }

    }


    public Integer pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            try {
                throw new Exception("stack is Empty");
            } catch (Exception e) {

            }

            if (queue1.isEmpty()) {
                while (queue2.size() > 1) {
                    queue1.add(queue2.poll());
                }
                return queue2.poll();
            }

            if (queue2.isEmpty()) {
                while (queue1.size() > 1) {
                    queue2.add(queue1.poll());
                }
                return queue1.poll();
            }
        }
        return null;
    }
}
