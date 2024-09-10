package BASE.section3.part3;

import java.util.Scanner;

public class Main {

    public String[] solution(int n, int[] aArray, int[] bArray) {

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int a = aArray[i];
            int b = bArray[i];

            if (a - b == 1) {
                answer[i] = "A";
            }
            else if (a == b) {
                answer[i] = "D";
            }
            else {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        String[] solution = T.solution(5, new int[]{2, 3, 3, 1, 3}, new int[]{1, 1, 2, 2, 3});
//        for (String s : solution) {
//            System.out.println(s);
//        }

        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (String s : T.solution(n, a, b)) {
            System.out.println(s);
        }
    }
}