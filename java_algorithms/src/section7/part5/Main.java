package section7.part5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution2(int n, int[] arr) {
        String answer = "U";
        

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, arr));

        System.out.print(T.solution2(8, new int[] {20, 25, 52, 30, 39, 33, 43, 33}));
    }

    /**
     *
     */
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }

        return answer;
    }
}