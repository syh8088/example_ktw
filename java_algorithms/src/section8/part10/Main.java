package section8.part10;


import java.util.LinkedList;
import java.util.Queue;

public class Main {

    Node root;

    public int BFS2(Node root) {

        return 0;
    }

    public static void main(String[] args) {

        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS(tree.root));
    }

    public int BFS(Node root) {

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;

        while (!Q.isEmpty()) {

            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Node node = Q.poll();
                if (node.lt == null && node.rt == null) {
                    return level;
                }

                if (node.lt != null) Q.offer(node.lt);
                if (node.rt != null) Q.offer(node.rt);
            }
            level++;
        }

        return level;
    }

    static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            lt = null;
            rt = null;
        }
    }
}