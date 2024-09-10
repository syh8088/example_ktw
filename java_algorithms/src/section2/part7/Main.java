package section2.part7;

import java.util.Scanner;

public class Main {

    public String solution2(String str) {

        String answer = "YES";






        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
        String str = "gooG";
        System.out.print(T.solution2(str));
    }


    public String solution(String str) {

        String answer = "YES";

        str = str.toUpperCase();

        int len = str.length() / 2;
        int lt = 0, rt = str.length() - 1;
        for (int i = 0; i < len; i++) {

            char ltChar = str.charAt(lt);
            char rtChar = str.charAt(rt);
            if (ltChar != rtChar) {
                answer = "NO";
                break;
            }

            lt++;
            rt--;
        }

        return answer;
    }
}