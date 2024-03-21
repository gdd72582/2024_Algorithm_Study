package BOJ_1st_Week;

import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ_2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //각 자리 수 분리하기
        int[] arrNum = Stream.of(String.valueOf(N).split("")).mapToInt(Integer::parseInt).toArray();

        // maxNum = 각 자리 수 최대합
        int maxNum = (arrNum.length-1) * 9 + arrNum[0];
        int step = N - maxNum;

        for ( ;step <= N; step++) {
            int result = (step) + sumOfDigit(step);
            if(result == N) {
                System.out.printf("%d",step); System.exit(0);
            }
        }
        System.out.println(0);

    }
    public static int sumOfDigit (int step){
         return Stream.of(String.valueOf(step).split("")).mapToInt(Integer::parseInt).sum();
    }
}
