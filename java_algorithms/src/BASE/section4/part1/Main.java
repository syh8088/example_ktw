package BASE.section4.part1;

import java.util.ArrayList;
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
                3,
                new int[]{1, 3, 5},
                5,
                new int[]{2, 3, 6, 7, 9}
        )) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int size1, int[] arr1, int size2, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < size1 && p2 < size2) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
            }
            else {
                answer.add(arr2[p2]);
                p2++;
            }
        }

        while (p1 < size1) {
            answer.add(arr1[p1]);
            p1++;
        }

        while (p2 < size2) {
            answer.add(arr2[p2]);
            p2++;
        }

        return answer;
    }
}