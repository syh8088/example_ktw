package BASE.section3.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
       for (int i = 1; i < n; i++) {
           if (arr[i] > arr[i - 1]) {
               answer.add(arr[i]);
           }
       }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.print(T.solution(6, new int[] {7, 3, 9, 5, 6, 12}));

//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int x : T.solution(n, arr)) {
//            System.out.print(x + " ");
//        }
    }
}