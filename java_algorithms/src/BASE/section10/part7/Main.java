package BASE.section10.part7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    public int v1;
    public int v2;
    public int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {


    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) {
            return v;
        }
        else {
            return unf[v] = Find(unf[v]);
        }
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int m = kb.nextInt();

        int n = 9;
        int m = 12;

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            Union(a, b);
//        }

        int[][] inputArray = new int[][] {
                { 1, 2, 12 },
                { 1, 9, 25 },
                { 2, 3, 10 },
                { 2, 8, 17 },
                { 2, 9, 8 },
                { 3, 4, 18 },
                { 3, 7, 55 },
                { 4, 5, 44 },
                { 5, 6, 60 },
                { 5, 7, 38 },
                { 7, 8, 35 },
                { 8, 9, 15 }
        };
        ArrayList<Edge> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int[] ints = inputArray[i];
            int a = ints[0];
            int b = ints[1];
            int c = ints[2];
            arr.add(new Edge(a, b, c));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Edge edge : arr) {
            int fv1 = Find(edge.v1);
            int fv2 = Find(edge.v2);
            if (fv1 != fv2) {
                answer += edge.cost;
                Union(edge.v1, edge.v2);
            }
        }

        System.out.println(answer);
    }

}
