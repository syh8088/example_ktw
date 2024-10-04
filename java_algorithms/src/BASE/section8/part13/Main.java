package BASE.section8.part13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS2(int v) {

        






    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();
        n = 5;
        m = 9;

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];

//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            graph.get(a).add(b);
//        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(5);
        graph.get(3).add(4);
        graph.get(4).add(2);
        graph.get(4).add(5);

        ch[1] = 1;
        T.DFS2(1);
        System.out.println(answer);
    }

    public void DFS(int v) {

        if (v == n) {
            answer++;
        }
        else {
            ArrayList<Integer> arrayList = graph.get(v);
            for (int nv : arrayList) {
                int checked = ch[nv];
                if (checked == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

}