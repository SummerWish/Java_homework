public class Stack {
    private Object[] values = new Object[5];
    private int top = 0;
    public boolean isEmpty() {
        return top <= 0;
    }

    public Object pop() {
        return values[--top];
    }

    public void push(Object v) {
        values[top++] = v;
    }

    public void remove(int n) {
        while (n > 0) {
            pop();
            n--;
        }
    }
}