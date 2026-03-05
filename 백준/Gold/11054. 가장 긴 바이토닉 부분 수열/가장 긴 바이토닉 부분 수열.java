import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int [N+1][2];
        int[] arr= new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int j = 1; j < N+1; j++){
            int v = 0;
            for(int k = 1; k < j; k++){
                if(arr[j] > arr[k]) v = Math.max(dp[k][0],v);
            }
            dp[j][0] = v + 1;
        }

        for(int x = N; x >= 1; x--){
            int v = 0;
            for(int y = N; y > x; y--){
                if(arr[x] > arr[y]) v = Math.max(dp[y][1], v);
            }
            dp[x][1] = v+1;
        }
        
        int result = 0;
        for(int i = 1; i < N+1; i++){
            for(int j =0; j <= 1; j++){
                result = Math.max(dp[i][0]+dp[i][1]-1,result);
            }
        }

        System.out.println(result);
        }


}
