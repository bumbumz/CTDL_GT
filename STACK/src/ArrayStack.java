import java.util.EmptyStackException;

public class ArrayStack<T> implements STACKADT<T> {

    private int top;
    private T[] stack;
    private final int DEFAULT_CAPACITY = 100;

    public T[] getStack() {
        return stack;
    }

    public void setStack(T[] stack) {
        this.stack = stack;
    }

    public ArrayStack() {
        this.top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initCapacity) {
        this.top = 0;
        stack = (T[]) (new Object[initCapacity]);
    }

    private void resize() {
        T[] newStack = (T[]) new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) {
            resize();
        }
        this.stack[top] = element;
        this.top++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }

}
