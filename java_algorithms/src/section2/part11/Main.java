package section2.part11;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "";

        str += " ";
        char[] charArray = str.toCharArray();
        int length = charArray.length - 1;
        int cnt = 1;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];

//            if (length > i + 1) {
            char c2 = charArray[i + 1];
            if (c == c2) {
                cnt++;
            }
            else {
                if (cnt != 1) {
                    answer += c;
                    answer += cnt;
                }
                else {
                    answer += c;
                }
                cnt = 1;
            }
//            }
//            else {
//                cnt = 1;
//            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        System.out.print(T.solution("KSTTTSEEKFKKKDJJGG"));
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}