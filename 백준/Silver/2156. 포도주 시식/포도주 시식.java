import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int [N+1][3];
        int a = Integer.parseInt(br.readLine());
        dp[1][0] = 0;
        dp[1][1] = a;
        dp[1][2] = 0;
        int result = a;

        for(int i = 2 ; i <= N; i++){
            int v = Integer.parseInt(br.readLine());
            dp[i][0] = Math.max(dp[i-1][2],Math.max(dp[i-1][0],dp[i-1][1]));
            dp[i][1] = dp[i-1][0] + v;
            dp[i][2] = dp[i-1][1] + v;

            result = Math.max(result, dp[i][0]);
            result = Math.max(result, dp[i][1]);
            result = Math.max(result, dp[i][2]);

        }


        System.out.println(result);
        }


}
