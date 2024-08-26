package section2.part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int[] solution(String str, char target) {

        int[] answer = new int[str.length()];
        int length = answer.length;

        int p = 1000;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == target) {
                p = 0;
            }
            else {
                p++;
            }

            answer[i] = p;
        }

        p = 1000;
        for (int i = length - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == target) {
                p = 0;
            }
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
        System.out.print(T.solution("teachermode", 'e'));
    }
}