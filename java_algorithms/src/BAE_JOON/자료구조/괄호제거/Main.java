package BAE_JOON.자료구조.괄호제거;

import java.util.*;
import java.io.*;

public class Main {

    static char[] ch;

    static List<Pair> list = new ArrayList<>();
    static Set<String> result = new TreeSet<>();
    static boolean[] checkList; // 괄호 지울지 말지 판단하는 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        ch = br.readLine().toCharArray();
        ch = "(0/(0))".toCharArray();

        // 1. 괄호 쌍 구하기
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < ch.length ; i++) {
            if (ch[i] == '(') {
                stack.push(i);
            }
            else if (ch[i] == ')') {
                list.add(new Pair(stack.pop(), i));
            }
        }

        // 2. 괄호 존재하는 모든 조합 구하기
        checkList = new boolean[ch.length];
        comb(0);

        // 출력하기
        Iterator<String> iter = result.iterator();  // set을 iterator 안에 담기
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void comb(int depth) {
        if (depth == list.size()) {
            boolean flag = false; // 괄호가 1개 이상 제거되었는지 나타내는 변수

            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < ch.length ; i++) {

                boolean checked = checkList[i];
                if (!checked) {
                    char ch1 = ch[i];
                    sb.append(ch1);
                }
                else {
                    flag = true;
                }
            }

            if (flag) { // 최소 1개의 괄호가 제거된 경우, 결과 set에 저장
                result.add(sb.toString());
            }
            return;
        }

        // 현재 괄호 제거 안 함
        comb(depth + 1);

        // 현재 괄호 제거
        Pair now = list.get(depth);
        checkList[now.start] = true;
        checkList[now.end] = true;
        comb(depth + 1);
        checkList[now.start] = false;
        checkList[now.end] = false;
    }
}

class Pair {
    int start, end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}