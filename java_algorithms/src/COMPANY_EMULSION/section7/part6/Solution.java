package COMPANY_EMULSION.section7.part6;

import java.util.*;

class Solution {

    public int solution(String s) {

        int answer = 0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {

            System.out.println("c = " + c);

        }


        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution("25114"));
        System.out.println(T.solution("23251232"));
        System.out.println(T.solution("21020132"));
        System.out.println(T.solution("21350"));
        System.out.println(T.solution("120225"));
        System.out.println(T.solution("232012521"));
    }
}