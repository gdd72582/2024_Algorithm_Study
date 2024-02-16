package BOJ_5th_Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        for(int i = 0; i < N ; i++){
            int data = Integer.parseInt(br.readLine());
            if(data > 1) plusPq.add(data);
            else if (data == 1) one++;
            else if(data == 0) zero++;
            else minusPq.add(data);
        }
        int sum = 0;
        while(plusPq.size() > 1){
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum += first*second;
        }
        if(!plusPq.isEmpty()){
            sum += plusPq.remove();
        }
        while(minusPq.size() > 1){
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum += first*second;
        }
        if(zero == 0 && !minusPq.isEmpty()){
            sum += minusPq.remove();
        }
        System.out.println(sum + one);
    }
}
