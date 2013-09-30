/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 03.09.13
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */
public class two {

    public static class Node {
        private int value;
        private Node next;

        public Node() {
            this.next = null;
        }


        static Node reverse(Node root) {
            // root - current position in list
            Node p = null;
            while (root != null)
            {
                Node n = root.next;
                root.next = p;
                p = root;
                root = n;
            }
            return p;
        }


        static void printList(Node root) {

            while (root != null) {
                System.out.println(root.value);
                root = root.next;
            }
        }


        public static void main(String[] args) {
            Node root = new Node();
            root.value = 0;

            Node l1 = new Node();
            l1.value = 1;
            root.next = l1;

            Node l2 = new Node();
            l2.value = 2;
            l1.next = l2;

            Node l3 = new Node();
            l3.value = 3;
            l2.next = l3;

            Node l4 = new Node();
            l4.value = 4;
            l3.next = l4;

            Node qq  = reverse(root);

            printList(qq);
        }


    }
}
