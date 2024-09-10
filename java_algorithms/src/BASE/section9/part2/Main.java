package BASE.section9.part2;

import java.util.Scanner;

public class Main {

    static int answer = Integer.MIN_VALUE;
    static int n;
    static int c;

    public void DFS2(int L, int sum, int[] arr) {







    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        c = kb.nextInt();
//        n = kb.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//          T.DFS(0, 0, arr);
//        System.out.print(answer);

        n = 5;
        c = 259;
        int[] arr = new int[] {81, 58, 42, 33, 61};
        T.DFS2(0, 0, arr);
        System.out.print(answer);
    }

    public void DFS(int L, int sum, int[] arr) {

        if (sum > c) return;

        if (L == n) {
            answer = Math.max(sum, answer);
        }
        else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

}