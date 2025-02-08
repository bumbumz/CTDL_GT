public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("Size: " + stack.size());
        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());

    }
}
