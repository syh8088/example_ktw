package BASE.section10.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CourseSlug implements Comparable<CourseSlug> {

    public int start;
    public int end;

    public CourseSlug(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(CourseSlug o) {
        if (this.end == o.end) {
            return this.start - o.start;
        }
        else {
            return this.end - o.end;
        }
    }
}

public class Main {

    public int solution2(int n, ArrayList<CourseSlug> arr) {

        int cnt = 0;





        return cnt;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        ArrayList<CourseSlug> arr = new ArrayList<>();

//        for (int i = 0; i < n; i++) {
//            int start = kb.nextInt();
//            int end = kb.nextInt();
//            arr.add(new CourseSlug(start, end));
//        }

        arr.add(new CourseSlug(1, 4));
        arr.add(new CourseSlug(2, 3));
        arr.add(new CourseSlug(3, 5));
        arr.add(new CourseSlug(4, 6));
        arr.add(new CourseSlug(5, 7));

        System.out.println(T.solution2(5, arr));
    }

    /**
     *
     */
    public int solution(int n, ArrayList<CourseSlug> arr) {

        int cnt = 0;

        Collections.sort(arr);

        int end = 0;
        for (int i = 0; i < n; i++) {
            CourseSlug target = arr.get(i);

            if (end <= target.start) {
                end = target.end;
                cnt++;
            }
        }
        return cnt;
    }
}
