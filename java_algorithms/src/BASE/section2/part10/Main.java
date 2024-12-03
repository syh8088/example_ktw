package BASE.section2.part10;

import java.util.Scanner;

public class Main {

    public int[] solution2(String str, char target) {

        int[] answer = new int[str.length()];


        


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        char t = kb.next().charAt(0);

        String str = "teachermode";
        char t = 'e';

        for (int x : T.solution2(str, t)) {
            System.out.print(x + " ");
        }
    }




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
}