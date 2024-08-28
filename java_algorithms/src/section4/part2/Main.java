package section4.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution2(int size1, int[] arr1, int size2, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = kb.nextInt();
//        }
//
//        int m = kb.nextInt();
//        int[] b = new int[m];
//        for (int i = 0; i < m; i++) {
//            b[i] = kb.nextInt();
//        }
//
//        for (int x : T.solution(n, a, m, b)) {
//            System.out.print(x + " ");
//        }

        for (int x : T.solution(
                5,
                new int[]{1, 3, 9, 5, 2},
                5,
                new int[]{3, 2, 5, 7, 8}
        )) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int size1, int[] arr1, int size2, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < size1 && p2 < size2) {

            int a = arr1[p1];
            int b = arr2[p2];

            if (a == b) {
                answer.add(a);
                p1++;
                p2++;
            }
            else if (a < b) {
                p1++;
            }
            else {

                p2++;
            }


        }

        return answer;
    }
}