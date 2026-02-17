public class stack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }
//push operation
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
//pop operation
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
//peek operation
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(8);

        System.out.println(s.peek()); // 4
        System.out.println(s.pop());  // 4
        System.out.println(s.peek()); // 2

    }
}
