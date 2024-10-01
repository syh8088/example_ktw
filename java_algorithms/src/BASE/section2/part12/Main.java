package BASE.section2.part12;

import java.util.Scanner;

public class Main {

    public String solution2(int n, String str) {

        String answer = "";







        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.print(T.solution2(4, "#****###**#####**#####**##**"));

//        int n = kb.nextInt();
//        String str = kb.next();
//        System.out.print(T.solution(n, str));
    }


    public String solution(int n, String str) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            // 바뀐 2진수를 10 진수화 합니다.
            int num = Integer.parseInt(temp, 2);

            answer += (char) num;

            System.out.println("temp = " + temp);
            str = str.substring(7);
        }


        return answer;
    }
}