package BOJ_1st_Week;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4779 {
    /****************************************
     *
     * 주어진 N 의 값의 따른 결과값에 관한 귀납적 정의
     * 0 = -
     * 1 = - -
     * 2 = - -   - -
     * 3 = - -   - -         - -   - -
     * N = N-1 빈칸 N-1 (이때 빈칸의 수는 3^N-1이자, N-1의 원소 갯수)
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N;
        String input;
        //새로운 입력이 없을 때까지 계속 입력 받기
        while ((input = bufferedReader.readLine()) != null) {
            N = Integer.parseInt(input);
            System.out.println(canTRecursion(N));
        }
    }
    public static String canTRecursion (int N){
        if(N == 0) return "-";
        String blank = " ".repeat(Math.max(0, (int) Math.pow(3, N - 1))); // 3^N-1 만큼 빈칸 만들기
        return canTRecursion(N-1) + blank + canTRecursion(N-1); //N이 0이 아닌 경우, 재귀
    }
}
