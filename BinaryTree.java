/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 03.09.13
 * Time: 15:51
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTree {

    public static class Node {
        private int value;
        private Node l;
        private Node r;

        public Node() {
            this.l = null;
            this.r = null;
        }
    }

    public static int maxDepth(Node node) {
        if (node == null)
            return 0;
        else
        {
            int l = maxDepth(node.l);
            int r = maxDepth(node.r);
            if (l > r)
                return l+1;
            else
                return r+1;
        }
    }


    public static void main(String[] args) {
        Node root = new Node();

        Node n1 = new Node();
        root.l = n1;

        Node n2 = new Node();
        n1.l = n2;

        Node n3 = new Node();
        n1.r = n3;


        Node n4 = new Node();
        root.r = n4;

        Node n5 = new Node();
        n4.l = n5;

        Node n6 = new Node();
        n4.r = n6;

        System.out.println(maxDepth(root));

    }
}