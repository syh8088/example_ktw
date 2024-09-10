package section10.part7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {

    public int v1;
    public int v2;
    public int cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost - o.cost;
    }
}

public class Main2 {


    static int[] unf;

    public static int Find(int v) {


        return 0;
    }

    public static void Union(int a, int b) {


    }

    public static void main(String[] args) {

        Main2 T = new Main2();
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
        ArrayList<Edge2> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int[] ints = inputArray[i];
            int a = ints[0];
            int b = ints[1];
            int c = ints[2];
            arr.add(new Edge2(a, b, c));
        }

        int answer = 0;

        for (Edge2 edge : arr) {



        }

        System.out.println(answer);
    }

}
