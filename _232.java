import java.util.Stack;

public class _232 {
    public class MyQueue {

        Stack<Integer> stack;
        public MyQueue() {
            stack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            int pop = stack.get(0);
            stack.remove(0);

            return pop;
        }

        public int peek() {
            return stack.get(0);
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }


    public class MyQueuee {
        Stack<Integer> stackLeft;
        Stack<Integer> stackRight;

        public MyQueuee() {
            stackLeft = new Stack<>();
            stackRight = new Stack<>();
        }

        public void push(int x) {
            stackLeft.push(x);
        }

        public int pop() {
            while(!stackLeft.isEmpty()){
                stackRight.push(stackLeft.pop());
            }
            int pop = stackRight.pop();

            while(!stackRight.isEmpty()){
                stackLeft.push(stackRight.pop());
            }

            return pop;
        }

        public int peek() {
            while(!stackLeft.isEmpty()){
                stackRight.push(stackLeft.pop());
            }
            int peek = stackRight.peek();
            while(!stackRight.isEmpty()){
                stackLeft.push(stackRight.pop());
            }
            return peek;
        }

        public boolean empty() {
            return stackLeft.isEmpty();
        }
    }
}
