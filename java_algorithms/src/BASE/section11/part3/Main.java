package BASE.section11.part3;

import java.util.*;

public class Main {

    public int solution2(int n, int[] arr) {

        int answer = 0;

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
//        System.out.print(T.solution(n, arr));

        int[] arr = new int[] {5, 3, 7, 8, 6, 2, 9, 4};
        System.out.println(T.solution(8, arr));
    }

    static int[] dy;
    public int solution(int n, int[] arr) {

        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {

                int ivalue = arr[i];
                int jvalue = arr[j];
                int dyJ = dy[j];

                if (ivalue > jvalue && dyJ > max) {
                    max = dyJ;
                }

                dy[i] = max + 1;
                answer = Math.max(answer, dy[i]);
            }
        }

        return answer;
    }

}