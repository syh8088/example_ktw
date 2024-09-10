package BASE.section2.part6;

import java.util.Scanner;

public class Main {

    public String solution2(String str) {

        String answer = "";


        

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
        String str = "ksekkset";
        T.solution2(str);
    }


    public String solution(String str) {

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (str.indexOf(c) == i) {
                answer += c;
            }
        }

        return answer;
    }
}