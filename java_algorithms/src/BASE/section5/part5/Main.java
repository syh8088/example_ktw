package BASE.section5.part5;

import java.util.*;

public class Main {

    public int solution2(int n, int k, int[] arr) {

        int answer = 0;




        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        System.out.print(T.solution(n, k, arr));

        System.out.print(T.solution2(10, 3, new int[] {13, 15, 34, 23, 45, 65, 33, 11, 26, 42}));

    }


    public int solution(int n, int k, int[] arr) {

        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 1;
        for (int x : Tset) {
            if (cnt == k) {
                return x;
            }
            cnt++;
        }

        return answer;
    }


}