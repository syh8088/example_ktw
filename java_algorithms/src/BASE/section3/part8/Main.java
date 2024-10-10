package BASE.section3.part8;

import java.util.Scanner;

public class Main {

    public int[] solution2(int n, int[] arr) {



        
        return null;
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

        for (int result : T.solution2(
                5,
                new int[] {87, 89, 92, 100, 76}
//                new int[] {87, 87, 92, 100, 76}
        )
        ) {
            System.out.println(result);
        }
    }

    public int[] solution(int n, int[] arr) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            int cnt = 1;
            int itarget = arr[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int jtarget = arr[j];
                    if (itarget < jtarget) {
                        cnt++;
                    }
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

}