package BOJ_3rd_Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2748 {
    static int[] D;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        D = new int[N+1];
        for(int i = 0; i < N + 1; i++) {
            D[i] = -1;
        }
        D[0] = 0;
        D[1] = 1;

        System.out.print(fibo(N));
    }
    private static int fibo(int n){
        if (D[n] != -1)
            return D[n];
        else
            return D[n] = fibo(n - 1) + fibo(n - 2);
    }
}
