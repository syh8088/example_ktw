package section3.part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> store = new ArrayList<>();

        answer.add(arr[0]);
        store.add(arr[0]);

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            int target = arr[i];
            if (target > max) {
                answer.add(target);
            }

            max = Math.max(max, target);
        }

        return answer.size();
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.print(T.solution(8, new int[] {130, 135, 148, 140, 145, 150, 150, 153}));

//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        System.out.print( T.solution(n, arr));
    }
}