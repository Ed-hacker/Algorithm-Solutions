import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][2];

        int one = Integer.parseInt(br.readLine());
        dp[1][0] = one;
        dp[1][1] = one;

        for(int i = 2; i <= N; i++){
            int v = Integer.parseInt(br.readLine());
            dp[i][0] = dp[i-1][1] + v;
            dp[i][1] = Math.max(dp[i-2][0],dp[i-2][1]) + v;
        }

        System.out.println(Math.max(dp[N][0],dp[N][1]));



        }


}
