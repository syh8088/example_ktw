package section7.part4;

import java.util.Scanner;

public class Main {

    public int[] solution2(int s, int n, int[] arr) {








        return arr;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int s = kb.nextInt();
//        int n = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        for (int x : T.solution(s, n, arr)) {
//            System.out.print(x + " ");
//        }


        for (int x : T.solution2(5, 9, new int[]{ 1, 2, 3, 2, 6, 2, 3, 5, 7 })) {
            System.out.print(x + " ");
        }
    }

    /**
     *
     */
    public int[] solution(int s, int n, int[] arr) {

        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) { // Cache Hit
                    pos = i;
                }
            }

            if (pos == -1) { // Cache Miss
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            else { // Cache Hit
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }

            cache[0] = x;
        }

        return cache;
    }
}