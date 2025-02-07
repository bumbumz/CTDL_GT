public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("A", "18");
        Person p2 = new Person("B", "18");
        Person p3 = new Person("C", "18");
        Person p4 = new Person("D", "18");

        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);

        Person cur = p1;
        do {
            System.out.println(cur.toString());
            cur = cur.getNext();

        } while (cur != null);
    }
}
