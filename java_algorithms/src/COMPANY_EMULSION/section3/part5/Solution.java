package COMPANY_EMULSION.section3.part5;

import java.util.*;

class Solution {

    public String solution2(String[] votes, int k) {

        String answer = " ";


        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution(new String[]{
                "john tom",
                "daniel luis",
                "john luis",
                "luis tom",
                "daniel tom",
                "luis john"
        }, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }

    /**
     * 내가 푼거...... (틀린거...???)??...
     */
    public String solution(String[] votes, int k) {

        String answer = " ";
        HashMap<String, List<String>> map = new HashMap<>();
        for (String vote : votes) {
            String[] str = vote.split(" ");
            String s1 = str[0];
            String s2 = str[1];

            if (!map.containsKey(s2)) {
                List<String> array = new ArrayList<>();
                array.add(s1);
                map.put(s2, array);
            }
            else {
                List<String> orDefault = map.get(s2);
                orDefault.add(s1);
            }
        }

        HashMap<String, Integer> result = new HashMap<>();
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            if (list.size() >= k) {
                for (String value : list) {
                    result.put(value, result.getOrDefault(value, 0) + 1);
                }
            }
        }

        int max = 0;
        for (String key : result.keySet()) {
            int target = result.get(key);
            if (target > max) {
                max = target;
                answer = key;
            }
        }

        return answer;
    }
}