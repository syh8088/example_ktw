package BASE.section2.part3;

import java.util.Scanner;

public class Main {

    public static String solution3(String s) {

        String answer = "";
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String s = kb.next();
        String s = "it is time to study";

        System.out.print(solution(s));

    }

    public static String solution(String s) {

        String answer = "";
        int max = Integer.MIN_VALUE;

        String[] sArray = s.split(" ");

        for (String target : sArray) {
            int length = target.length();
            if (length > max) {
                max = length;
                answer = target;
            }
        }

        return answer;
    }

    public static String solution2(String s) {

        String answer = "";
        int max = Integer.MIN_VALUE;
        int pos;

        while ((pos = s.indexOf(" ")) != -1) {
            String temp = s.substring(0, pos);
            int length = temp.length();
            if (length > max) {
                max = length;
                answer = temp;
            }

            s = s.substring(pos + 1);
        }

        return answer;
    }
}