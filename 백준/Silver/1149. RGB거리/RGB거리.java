import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int[][] dp = new int[N + 1][3];  //dp는 i번째 까지 고려했을 때 각 집의 선택하고나서의 min

        // 1부터 N까지 모든 집을 동일한 로직으로 처리
        for (int i = 1; i <= N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j <= 2; j++) {
                int v = Integer.parseInt(st2.nextToken());
                if(j==0){
                    dp[i][j] = Math.min(dp[i-1][1],dp[i-1][2]) + v;
                }else if(j==1)  dp[i][j] = Math.min(dp[i-1][0],dp[i-1][2]) + v;
                else  dp[i][j] = Math.min(dp[i-1][1],dp[i-1][0]) + v;
            }
        }

        // 최종 결과는 dp[N] 중 최솟값
        System.out.println(Math.min(dp[N][2],Math.min(dp[N][0],dp[N][1])));
    }
}