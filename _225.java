import java.util.ArrayDeque;
import java.util.Queue;

public class _225 {

    static Queue<Integer> q1;

    public void MyStack() {
        q1 = new ArrayDeque<Integer>();
    }

    public void push(int x) {

        q1.add(x);
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop() {

        return q1.poll();
    }

    public int top() {

        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

