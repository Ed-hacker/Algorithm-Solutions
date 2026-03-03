import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int[][] dp = new int[N + 1][10];  //dp는 i번째 까지 고려했을 때 각 숫자를 선택하는 경우의 수

        for(int x = 1; x <= 9; x++){
            dp[1][x] = 1;
        }

        // 2부터 N까지 모든 집을 동일한 로직으로 처리
        for (int i = 2; i <= N; i++) {
            for(int j = 0; j <= 9; j++){
                if(j==0) dp[i][0] = dp[i-1][1];
                else if(j==9) dp[i][9] = dp[i-1][8];
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];

                if(dp[i][j] > 1000000000) dp[i][j] %= 1000000000;
            }
        }
        long sum = 0L;
        for(int k = 0; k <=9; k++){
            sum += dp[N][k];
        }

        int result = Math.toIntExact(sum % 1000000000);

        // 최종 결과는 dp[N] 중 최솟값
        System.out.println(result);
    }
}