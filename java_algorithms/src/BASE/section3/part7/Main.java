package BASE.section3.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int[] arr) {







        return 0;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, arr));

        System.out.print(T.solution2(10, new int[] {1, 0, 1, 1, 1, 0, 0, 1, 1, 0}));
    }

    public int solution(int n, int[] arr) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            int target = arr[i];

            if (target == 1) {
                if (i != 0) {
                    answer[i] = 1 + answer[i - 1];
                }
                else {
                    answer[i] = 1;
                }
            }
            else {
                answer[i] = 0;
            }
        }

        return Arrays.stream(answer).sum();
    }
}