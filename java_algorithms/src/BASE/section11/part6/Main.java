package BASE.section11.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int[] arr, int m) {

        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int dy[] = new int[m + 1];

        for (int i = 1; i < n; i++) {
            int ps = kb.nextInt();
            int pt = kb.nextInt();
            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }

    public int solution(int n, int m) {
//
//        int[] dy = new int[m + 1];
//        for (int i = 0; i < n; i++) {
//            int ps = kb
//        }

        return 0;
    }
}