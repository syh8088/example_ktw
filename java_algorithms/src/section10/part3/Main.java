package section10.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {

    public int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) {
            return this.state - o.state;
        }
        else {
            return this.time - o.time;
        }
    }
}

public class Main {

    public int solution2(int n, ArrayList<Time> arr) {

        int answer = Integer.MIN_VALUE;






        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        ArrayList<Time> arr = new ArrayList<>();

//        for (int i = 0; i < n; i++) {
//            int start = kb.nextInt();
//            int end = kb.nextInt();
//            arr.add(new Time(start, 's'));
//            arr.add(new Time(end, 'e'));
//        }

        arr.add(new Time(14, 's'));
        arr.add(new Time(18, 'e'));
        arr.add(new Time(12, 's'));
        arr.add(new Time(15, 'e'));
        arr.add(new Time(15, 's'));
        arr.add(new Time(20, 'e'));
        arr.add(new Time(20, 's'));
        arr.add(new Time(30, 'e'));
        arr.add(new Time(5, 's'));
        arr.add(new Time(14, 'e'));

        System.out.println(T.solution2(5, arr));
    }

    /**
     *
     */
    public int solution(int n, ArrayList<Time> arr) {

        int answer = Integer.MIN_VALUE;

        Collections.sort(arr);
        int cnt = 0;

        for (Time time : arr) {
            if (time.state == 's') {
                cnt++;
            }
            else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}
