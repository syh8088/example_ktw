package section8.part9;


public class Main {

    Node root;

    public int DFS2(int s, int e) {

        return 0;
    }

    public static void main(String[] args) {

        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
    }

    public int DFS(int L, Node root) {

        if (root.lt == null && root.rt == null) { // 말단 노드
            return L;
        }
        else {
            L++;
            int lt = this.DFS(L, root.lt);
            int rt = this.DFS(L, root.rt);

            return Math.min(lt, rt);
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