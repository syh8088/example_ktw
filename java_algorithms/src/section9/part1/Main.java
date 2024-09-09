package section9.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String answer = "NO";
    static int n;
    static int total = 0;
    boolean flag = false;

    public void DFS2(int L, int sum, int[] arr) {








    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//            total += arr[i];
//        }
//          T.DFS(0, 0, arr);
//        System.out.print(answer);

        n = 6;
        int[] arr = new int[] {1, 3, 5, 6, 7, 10};
        total = Arrays.stream(arr).sum();
        T.DFS2(0, 0, arr);
        System.out.print(answer);
    }

    public void DFS(int L, int sum, int[] arr) {

        if (flag) return;
        if (sum > total / 2) return;

        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            this.DFS(L + 1, sum + arr[L], arr);
            this.DFS(L + 1, sum, arr);
        }
    }

}