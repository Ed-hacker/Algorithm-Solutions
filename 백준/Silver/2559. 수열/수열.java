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

        int[] sumArr = new int[N-k+1];
        for(int i = 0; i < N-k+1; i++){
            int sum = 0;
            for(int j = i; j < i+ k; j++){
                sum += arr[j];
            }
            sumArr[i] = sum;
        }
        int result = Integer.MIN_VALUE;
        for(int i : sumArr){
            result = Math.max(result,i);
        }

        System.out.println(result);
    }
}