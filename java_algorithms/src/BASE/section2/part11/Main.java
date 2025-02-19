package BASE.section2.part11;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution2(String str) {

        String answer = "";
        str = str + " ";
        char[] charArray = str.toCharArray();

        int count = 1;
        char c1;
        for (int i = 0; i < charArray.length - 1; i++) {
            char c = charArray[i];
            c1 = charArray[i + 1];

            if (c == c1) {
                count++;
            }
            else {
                if (count == 1) {
                    answer = answer + c;
                }
                else {
                    answer = answer + c + count;
                }

                count = 1;
            }

        }

        char c = charArray[charArray.length - 1];

        answer = answer + c;

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.print(T.solution2(str));

        System.out.println(T.solution2("KKHSSSSSSSE"));
        System.out.println(T.solution2("KSTTTSEEKFKKKDJJGG"));
    }


    public String solution(String str) {

        String answer = "";
        str = str + " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if (c == c2) {
                count++;
            }
            else {
                answer += c;
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    /**
     * 내가 풀어본것인데.. 틀리네.... ㅠㅠ
     */
    public String solution3(String str) {

        String answer = "";


        char[] charArray = str.toCharArray();
        char temp = ' ';
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (temp == charArray[i]) {
                count++;
            }
            else {
                if (count == 0) {
                    answer += charArray[i];
                }
                else {
                    answer += count;
                }
                temp = charArray[i];
                count++;
            }

        }


        return answer;
    }
}