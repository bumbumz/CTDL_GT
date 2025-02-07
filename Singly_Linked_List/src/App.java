public class App {
    public static void main(String[] args) throws Exception {
        // Node<Integer> node1 = new Node<>();
        // Node<Integer> node2 = new Node<>();
        // Node<Integer> node3 = new Node<>();
        // Node<Integer> node4 = new Node<>();

        // node1.setData(1);
        // node2.setData(2);
        // node3.setData(3);
        // node4.setData(4);

        // node1.setNextNode(node2);
        // node2.setNextNode(node3);
        // node3.setNextNode(node4);

        // Node<Integer> cur = node1;
        // while (cur != null) {
        // System.out.println(cur.getData());
        // cur = cur.getNextNode();
        // }

        Node<Person> node1 = new Node<>();
        Node<Person> node2 = new Node<>();
        Node<Person> node3 = new Node<>();
        Node<Person> node4 = new Node<>();

        Person p1 = new Person("Vinh");
        Person p2 = new Person("Hoang");
        Person p3 = new Person("Thanh");
        Person p4 = new Person("Huy");

        node1.setData(p1);
        node2.setData(p2);
        node3.setData(p3);
        node4.setData(p4);

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);

        Node<Person> cur = node1;
        while (cur != null) {
        System.out.println(cur.getData());
        cur = cur.getNextNode();
        }
    }
}
