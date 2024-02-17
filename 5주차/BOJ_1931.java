package BOJ_5th_Week;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] A = new int[N][2];
        for(int i = 0; i < N ; i++){
            A[i][0] = sc.nextInt(); //시작시간
            A[i][1] = sc.nextInt(); //종료시간
        }
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int end = -1;
        for(int i = 0; i < N; i++){
            if(A[i][0] >= end){ //시작시간이 종료시간보다 큰 것
                end = A[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
