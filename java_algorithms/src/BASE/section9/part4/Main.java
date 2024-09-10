package BASE.section9.part4;

import java.util.Scanner;

public class Main {

    static int[] pm;
    static int n;
    static int m;

    public void DFS2(int L) {


    }


    public static void main(String[] args) {

        Main T = new Main();

        n = 3;
        m = 2;
        pm = new int[m];
        T.DFS(0);
    }

    public void DFS(int L) {

        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
                System.out.println();
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }

    }

}