package interview;

import java.util.Stack;

/**
 * @Author: respass
 * @Date: 2018
 * @Description:两个栈实现一个队列
 */
public class TwoStackImplQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(Integer ele) {
        stack1.push(ele);
    }

    public Integer pop() {
        if (stack2.size() == 0 ) {
            while (stack1.size() > 0 ) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            try {
                throw new Exception("queue is empty!");
            } catch (Exception e) {

            }
        }
        Integer head = stack2.pop();
        return head;
    }


}
