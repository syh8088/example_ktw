package section3.part8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] target) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            int cnt = n;

            int i1 = target[i];
            for (int j = 0; j < n; j++) {
                int j1 = target[j];

                if (i1 > j1) {
                    cnt--;
                }

            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int result : T.solution(n, arr)) {
//            System.out.println(result);
//        }

        for (int result : T.solution(5, new int[] {87, 87, 92, 100, 76})) {
            System.out.println(result);
        }
    }
}