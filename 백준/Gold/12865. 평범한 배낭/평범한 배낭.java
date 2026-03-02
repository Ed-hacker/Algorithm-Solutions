import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N + 1][k + 1];

        // 1부터 N까지 모든 물건을 동일한 로직으로 처리
        for (int i = 1; i <= N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            for (int j = 1; j <= k; j++) {
                if (j - w >= 0) {
                    // 현재 물건을 넣는 경우 vs 안 넣는 경우 중 최대값
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                } else {
                    // 현재 물건을 못 넣으면 이전 물건까지의 최적해 그대로 가져옴
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // 최종 결과는 dp[N][k]에 저장
        System.out.println(dp[N][k]);
    }
}