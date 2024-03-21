package BOJ_2nd_Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10816 {
    static int[] card;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        card = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N ; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(num) - lowerBound(num)).append(" ");
        }
        System.out.println(sb);
    }
    public static int lowerBound(int value){

        int lo = 0;
        int hi = card.length;

        while(lo < hi){ // 둘이 같아질 때까지
            int mid = (lo + hi)/2;

            if(value <= card[mid]){
                hi = mid;
            }else{
                lo = mid +1;
            }
        }
        return lo;
    }

    public static int upperBound(int value){
        int lo = 0;
        int hi = card.length;

        while(lo < hi){ // 둘이 같아질 때까지
            int mid = (lo + hi)/2;

            if(value < card[mid]){
                hi = mid;
            }else{
                lo = mid +1;
            }
        }
        return lo;
    }

}
