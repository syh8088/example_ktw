package BASE.section9.part7;

import java.util.Scanner;

class Main {

    int[][] dy = new int[35][35];

    public int DFS2(int n, int r) {




        return 0;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int r = kb.nextInt();

        int n = 5;
        int r = 3;

        System.out.println(T.DFS(n, r));
    }

    public int DFS(int n, int r) {

        if (dy[n][r] > 0) {
            return dy[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        }
        else {
            dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
            return dy[n][r];
        }
    }

}