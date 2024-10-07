package BASE.section9.part5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int answer = Integer.MAX_VALUE;
    static int n;
    static int m;

    public void DFS2(int L, int sum, Integer[] arr) {




        


    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        m = kb.nextInt();

        n = 3;
        Integer[] arr = new Integer[] {1, 2, 5};
        m = 15;

        Arrays.sort(arr, Collections.reverseOrder());

        T.DFS2(0, 0, arr);

        System.out.println(answer);
    }

    public void DFS(int L, int sum, Integer[] arr) {

        if (sum > m) {
            return;
        }

        if (L >= answer) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, L);
        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }

    }

}