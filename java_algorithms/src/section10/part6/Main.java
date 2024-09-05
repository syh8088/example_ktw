package section10.part6;

import java.util.Scanner;

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
        int m = 7;

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            Union(a, b);
//        }

        int[][] arr = new int[][] {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 5},
                {6, 7},
                {7, 8},
                {8, 9}
        };
        for (int i = 0; i < m; i++) {
            int[] ints = arr[0];
            int a = ints[0];
            int b = ints[1];
            Union(a, b);
        }
        
//        int a = kb.nextInt();
//        int b = kb.nextInt();
        int a = 3;
        int b = 8;

        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

}
