package section9.part6;

import java.util.*;
class Main{

    static int[] pm, ch, arr;
    static int n, m;

    public void DFS2(int L) {







    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();
        n = 3;
        m = 2;

//        arr = new int[n];

//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }

        arr = new int[] {3, 6, 9};

        ch = new int[n];
        pm = new int[m];

        T.DFS(0);
    }

    public void DFS(int L) {

        if (L == m) {
            for (int x : pm) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}