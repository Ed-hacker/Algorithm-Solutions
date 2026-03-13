import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int [N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int[] sumArr = new int[N]; //누적합 배열
        sumArr[0] = arr[0];
        for(int i = 1; i < N; i++){
             sumArr[i] = sumArr[i-1] + arr[i];
        }
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < N-k+1; i++){
            if(i >= 1){
            result = Math.max(result, sumArr[i+k-1] - sumArr[i-1]);}
            else result = Math.max(result, sumArr[k-1]);
        }

        System.out.println(result);
    }
}