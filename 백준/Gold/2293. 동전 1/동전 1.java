import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int[] arr;
    static int [] dp;

    static void solve(int index) {
        if (index > N) return;

        int coin = arr[index];

        for(int i = coin; i < dp.length; i++){
            dp[i] = dp[i] + dp[i-coin];
        }
        
        solve(index + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //동전의 개수
        int k = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        for(int i = 1; i <= N; i++) { //1~N
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp= new int[k+1];
        dp[0] = 1;

        solve(1);

        System.out.println(dp[k]);

    }
}