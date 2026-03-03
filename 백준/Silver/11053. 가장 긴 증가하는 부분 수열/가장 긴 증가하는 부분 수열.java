import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int[] dp = new int[N + 1];  //dp는 i번째 까지 고려했을 때 가장 긴 길이
        int[] arr = new int[N + 1];


        // 1부터 N까지 일단 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int j = 1; j <= N; j++){ //dp 1부터 n까지
            int a  = 0;
            for(int k = 1; k < j; k++){ //dp k는 1부터 j전까지
                if(arr[k] < arr[j]) a = Math.max(a,dp[k]); //k가 더 작으면 현재 기준 최대인 a 와 k의 dp값 중 큰 걸 a 로 설정
            }
            dp[j] = ++a;
        }
        int result = 0;
        for(int x = 0; x <= N; x++){
            result = Math.max(dp[x],result);
        }

        // 최종 결과는 dp[N] 중 최솟값
        System.out.println(result);
    
    }
}