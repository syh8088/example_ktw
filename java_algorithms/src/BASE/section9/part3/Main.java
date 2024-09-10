package BASE.section9.part3;

import java.util.Scanner;

public class Main {

    static int answer = Integer.MIN_VALUE;
    static int n;
    static int m;

    public void DFS2(int L, int sum, int time, int[] ps, int[] pt) {









    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();
//
//        int[] a = new int[n];
//        int[] b = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = kb.nextInt();
//            b[i] = kb.nextInt();
//        }
//        T.DFS(0, 0, 0, a, b);
//        System.out.print(answer);

        n = 5;
        m = 20;
        int[] a = new int[] {10, 25, 15, 6, 7};
        int[] b = new int[] {5, 12, 8, 3, 4};
        T.DFS2(0, 0, 0, a, b);
        System.out.print(answer);
    }

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {

        if (m < time) return;

        if (L == n) {
            if (m >= time) {
                answer = Math.max(answer, sum);
            }
        }
        else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }

}