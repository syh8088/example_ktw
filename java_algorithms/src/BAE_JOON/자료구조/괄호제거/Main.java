package BAE_JOON.자료구조.괄호제거;

import java.util.*;
import java.io.*;


/**
 * https://www.acmicpc.net/problem/2800
 * 
 * 🧩 해결 아이디어
 * • 문자열 + 스택 + 재귀
 *
 * - 필요 자료구조
 * -- (여는 괄호 위치, 닫는 괄호 위치) 저장 객체
 * -- 괄호 위치 객체 저장 리스트
 * -- 괄호 제거해서 나오는 식 저장할 TreeSet
 * -- 괄호 지울지 말지 판단용 boolean 배열
 *
 * - 여는 괄호인 경우, 스택에 시작 위치 인덱스를 넣는다.
 * - 닫는 괄호인 경우, (스택의 여는 괄호 인덱스, 현재 인덱스)를 넣는다.
 * - 재귀를 통해 괄호를 표시할지 말지 각 쌍들을 조합하여 만들 수 있는 모든 경우의 수를 구한다. (백트래킹)
 * - 결과는 TreeSet 에 저장하여 중복을 없애고, 자동으로 사전 순 정렬하게 한다.
 *
 * 💥 유의사항
 * 재귀를 돌려도 크기가 2^10이라 괜찮다.
 */
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