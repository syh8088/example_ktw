package section7.part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution2(int h, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();


        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int h = kb.nextInt();
//
//        int[] arr = new int[h];
//        for (int i = 0; i < h; i++) {
//            arr[i] = kb.nextInt();
//        }
//        for (int x : T.solution(h, arr)) {
//            System.out.print(x + " ");
//        }


        for (int x : T.solution2(9, new int[]{ 120, 125, 152, 130, 135, 135, 143, 127, 160 })) {
            System.out.print(x + " ");
        }
    }

    /**
     *
     */
    public ArrayList<Integer> solution(int h, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < h; i++) {
            if (arr[i] != temp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}