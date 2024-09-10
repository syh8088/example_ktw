package BASE.section8.part14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int[] dis;

    public void BFS2(int v) {


    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();
        n = 6;
        m = 9;

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];

//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            graph.get(a).add(b);
//        }

        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(5);
        graph.get(3).add(4);
        graph.get(4).add(5);
        graph.get(4).add(6);
        graph.get(6).add(2);
        graph.get(6).add(5);

        ch[1] = 1;
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }






    public void BFS(int v) {

        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;

        queue.offer(v);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int nv : graph.get(current)) {
                int target = ch[nv];
                if (target == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[current] + 1;
                }
            }
        }

    }

}