package section3.part4;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    /**
     * 배열 쓰지 않고 해보기
     */
    public void solve(int n) {
        int a = 1, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public int[] solution(int n) {

        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }



        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        for (int x : T.solution(10)) {
//            System.out.print(x + " ");
//        }

        int n = kb.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}