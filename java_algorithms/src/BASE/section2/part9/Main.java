package BASE.section2.part9;

import java.util.Scanner;

public class Main {

    public int solution3(String str) {

        String answer = "";





        return 0;
    }



    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
        String str = "g0en2T0s8eSoft";
        System.out.print(T.solution(str));
    }


    public int solution(String str) {

        int answer = 0;

        for (char c : str.toCharArray()) {

            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

    public int solution2(String str) {

        String answer = "";

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

}