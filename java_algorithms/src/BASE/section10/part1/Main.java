package BASE.section10.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {

    public int h;
    public int w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class Main {

    public int solution2(int n, ArrayList<Body> arr) {

        int cnt = 0;
        Collections.sort(arr);
        cnt++;
        int max = arr.get(0).w;
        for (int i = 1; i < n; i++) {
            Body body = arr.get(i);
            if (body.w > max) {
                max = body.w;
                cnt++;
            }

        }





        return cnt;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        ArrayList<Body> arr = new ArrayList<>();

//        for (int i = 0; i < n; i++) {
//            int h = kb.nextInt();
//            int w = kb.nextInt();
//            arr.add(new Body(h, w));
//        }

        arr.add(new Body(172, 67));
        arr.add(new Body(183, 65));
        arr.add(new Body(180, 70));
        arr.add(new Body(170, 72));
        arr.add(new Body(181, 60));

        System.out.println(T.solution2(5, arr));
    }

    /**
     *
     */
    public int solution(int n, ArrayList<Body> arr) {
        int cnt = 0;



        

        return cnt;
    }
}
