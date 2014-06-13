public class Stack<E> {
    private Object[] values = new Object[5];
    private int top = 0;
    public boolean isEmpty() {
        return top <= 0;
    }

    public E pop() {
        return (E)values[--top];
    }

    public void push(E v) {
        values[top++] = (Object)v;
    }

    public void remove(int n) {
        while (n > 0) {
            pop();
            n--;
        }
    }

    public static void main(String[] args) {
        Stack<Double> s = new Stack<Double>();
        s.push(2.1);
        s.push(6.0);
    }
}