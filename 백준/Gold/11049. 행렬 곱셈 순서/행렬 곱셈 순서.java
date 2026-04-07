import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class Matrix{
        int r;
        int c;
        Matrix(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    static void dp(Matrix[] arr, int[][] dp){ //arr.length == N+1
        for(int gap = 1; gap < arr.length; gap++){ //gap은 구간의 길이
            for(int start = 1; start + gap < arr.length; start++) {
                int end = start + gap;
                dp[start][end] = Integer.MAX_VALUE;

                for(int mid = start; mid < end; mid++){
                    int cost = dp[start][mid] + dp[mid+1][end] + arr[start].r * arr[mid].c * arr[end].c;
                    dp[start][end] = Math.min(dp[start][end], cost);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][N+1];
        Matrix[] arr = new Matrix[N+1]; // 0 ~ N
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[i] = new Matrix(r, c);
        }

        dp(arr,dp);

        System.out.println(dp[1][N]);
    }
}