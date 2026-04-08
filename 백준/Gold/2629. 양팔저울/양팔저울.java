import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int[] arr;
    static boolean[][] dp;

    // dp[index][weight] : index번째 추가지 고려했을 때 weight를 만들 수 있는가?
    static void solve(int index, int weight) {
        // 1. 방어막: 이미 이 무게를 이 단계에서 수사했다면 즉시 복귀! (압축의 핵심)
        if (dp[index][weight]) return;

        // 2. 수사 기록
        dp[index][weight] = true;

        // 3. 모든 추를 다 봤다면 종료
        if (index == N) return;

        // 4. 3가지 선택지로 수사관 파견 (재귀)
        solve(index + 1, weight); // 안 넣기
        solve(index + 1, weight + arr[index]); // 구슬 반대편에 더하기
        solve(index + 1, Math.abs(weight - arr[index])); // 구슬 쪽에 넣어서 빼기
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //추의 개수
        arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp= new boolean[N+1][40001];

        solve(0,0);

        int ball = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < ball; j++){
            int ballWeight = Integer.parseInt(st.nextToken());
            if(dp[N][ballWeight]) System.out.print("Y" + " ");
            else System.out.print("N" + " ");
        }

    }
}