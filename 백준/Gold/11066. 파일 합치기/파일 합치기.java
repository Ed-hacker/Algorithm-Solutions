import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int dp(int[] sumArr){
        int n = sumArr.length - 1;
        int[][] dp = new int[n + 1][n + 1];

        for (int len = 1; len < n; len++) {
            for (int i = 1; i + len <= n; i++) {
                int j = i + len; 
                dp[i][j] = Integer.MAX_VALUE; 
                
                
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + (sumArr[j] - sumArr[i - 1]);
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine()); // 파일 수
            int[] arr = new int[n+1];
            int[] sumArr = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
               arr[j] = Integer.parseInt(st.nextToken());
               sumArr[j] = sumArr[j-1] + arr[j]; //구간합
            }

            System.out.println(dp(sumArr));
        }




    }
}