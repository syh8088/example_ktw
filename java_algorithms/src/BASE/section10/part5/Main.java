package BASE.section10.part5;

import java.util.*;

class Edge implements Comparable<Edge> {

    public int vex;
    public int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}

class Main {

    static int n;
    static int m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void solution(int v) {

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!queue.isEmpty()) {
            Edge tmp = queue.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                continue;
            }

            for (Edge ob : graph.get(now)) {

                int vex = ob.vex;
                int target = nowCost + ob.cost;
                if (dis[vex] > target) {
                    dis[vex] = target;
                    queue.offer(new Edge(vex, target));
                }
            }
        }
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();

        n = 6;
        m = 9;

        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            int c = kb.nextInt();
//            graph.get(a).add(new Edge(b, c));
//        }

        graph.get(1).add(new Edge(2, 12));
        graph.get(1).add(new Edge(3, 4));
        graph.get(2).add(new Edge(1, 2));
        graph.get(2).add(new Edge(3, 5));
        graph.get(2).add(new Edge(5, 5));
        graph.get(3).add(new Edge(4, 5));
        graph.get(4).add(new Edge(2, 2));
        graph.get(4).add(new Edge(5, 5));
        graph.get(6).add(new Edge(4, 5));

        T.solution(1);

        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            }
            else {
                System.out.println(i + " : impossible");
            }
        }
    }
}