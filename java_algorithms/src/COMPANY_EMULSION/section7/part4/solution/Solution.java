package COMPANY_EMULSION.section7.part4.solution;

import java.util.*;

class Solution {

    Deque<Character> tmp;
    ArrayList<String> res;
    HashMap<Character, Integer> hashMap;
    int len;

    public void DFS() {

        if (tmp.size() == len) {
            String Ts = "";
            for(char x : tmp) Ts += x;
            res.add(Ts);
        }
        else {
            for (char key : hashMap.keySet()) {

                if (hashMap.get(key) == 0) {
                    continue;
                }

                tmp.addFirst(key);
                tmp.addLast(key);
                hashMap.put(key, hashMap.get(key) - 2);

                DFS();

                tmp.pollFirst();
                tmp.pollLast();
                hashMap.put(key, hashMap.get(key) + 2);
            }
        }
    }

    public String[] solution(String s) {

        tmp = new LinkedList<>();
        res = new ArrayList<>();
        hashMap = new HashMap<>();
        len = s.length();

        for (char x : s.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        int odd = 0;
        char mid = '#';
        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) % 2 == 1) {
                mid = key;
                odd++;
            }
        }

        if (odd > 1) {
            return new String[]{};
        }

        if (mid != '#') {
            tmp.add(mid);
            hashMap.put(mid, hashMap.get(mid) - 1);
        }

        DFS();

        String[] answer = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution("aaaabb")));
        System.out.println(Arrays.toString(T.solution("abbcc")));
        System.out.println(Arrays.toString(T.solution("abbccee")));
        System.out.println(Arrays.toString(T.solution("abbcceee")));
        System.out.println(Arrays.toString(T.solution("ffeffaae")));
    }
}