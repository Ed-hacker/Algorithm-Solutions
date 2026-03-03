import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N + 1][N + 1];  //dp는 i번째 까지 고려했을 때 가장 큰 합



        for(int i = 1; i <= N; i++){ //dp 1부터 n까지
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++){
                int v = Integer.parseInt(st.nextToken());
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + v;
            }
        }
        int result = 0;
        for(int k = 1; k <= N; k++){
            result = Math.max(dp[N][k],result);
        }
        // 최종 결과는 dp[N] 중 최솟값
        System.out.println(result);

    }
}