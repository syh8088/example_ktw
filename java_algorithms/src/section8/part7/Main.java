package section8.part7;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    Node root;

    public void BFS2(Node root) {


    }

    public static void main(String[] args) {

        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }


    public void BFS(Node root) {

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int Level = 0;

        while (!Q.isEmpty()) {

            int len = Q.size();
            System.out.print(Level + " : ");

            for (int i = 0; i < len; i++) {
                Node current = Q.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) {
                    Q.offer(current.lt);
                }

                if (current.rt != null) {
                    Q.offer(current.rt);
                }
            }
            Level++;
            System.out.println();
        }

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