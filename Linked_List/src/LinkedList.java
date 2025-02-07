public class LinkedList<T> {
    private Node<T> header;

    public LinkedList() {
        this.header = null;
    }

    public void traverse() {
        Node<T> cur = header;
        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getNextNode();

        }
    }

    public void addFirst(T item) {
        Node<T> nextNode = new Node<T>(item, this.header);
        this.header = nextNode;

    }

    public void addLast(T item) {
        if (header == null) {
            addFirst(item);
        } else {
            Node<T> newNode = new Node<T>(item, null);
            Node<T> cur = this.header;
            while (cur.getNextNode() != null) {
                cur = cur.getNextNode();
            }
            cur.setNextNode(newNode);
        }
    }

    public void insertAfter(T key, T item) {
        Node<T> cur = header;
        while (!cur.getData().equals(key) && cur.getNextNode() != null) {
            cur = cur.getNextNode();
        }
        if (cur.getNextNode() != null) {
            Node<T> newNode = new Node<T>(item, cur.getNextNode());
            cur.setNextNode(newNode);
        }

    }

    public void removeFist() {
        if (header != null) {
            this.header = header.getNextNode();
        }
    }

    public void remove(T item) {
        if (header != null) {
            if (header.getData().equals(item)) {
                this.removeFist();
                return;
            }

            // Node<T> cur = this.header;
            // while (!cur.getNextNode().getData().equals(item) &&
            // cur.getNextNode().getNextNode() != null) {
            // cur = cur.getNextNode();
            // }
            // if (cur.getNextNode().getNextNode() != null) {
            // cur.setNextNode(cur.getNextNode().getNextNode());
            // }

            Node<T> pre = null;
            Node<T> cur = this.header;
            while (cur != null && !cur.getData().equals(item)) {
                pre = cur;
                cur = cur.getNextNode();
            }
            if (cur != null) {
                pre.setNextNode(cur.getNextNode());
            }
        }

    }

    public void removeLast() {
        if (header != null) {
            Node<T> pre = null;
            Node<T> cur = this.header;
            while (cur.getNextNode() != null) {
                pre = cur;
                cur = cur.getNextNode();
            }
            pre.setNextNode(null);

        }

    }

    public boolean isEmpty()
    {
        return this.header == null;
    }
    public int size()
    {
        int count=0;
        Node<T> cur = this.header;
        while(cur!=null)
        {
            count++;
            cur= cur.getNextNode();
        }
        return count;
        
    }

}
