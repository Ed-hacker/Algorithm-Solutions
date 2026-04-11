import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int[] MemArr;
    static int[] costArr;
    static int [] dp; //dp는 이 비용을 들였을 때, 내가 얻을 수 있는 메모리의 최대치
    static int costSum;




    static void solve(int index) {
        if (index > N) return;

        int memory = MemArr[index];
        int cost = costArr[index];

        for(int i = costSum; i >= 0; i--){
            if(i-cost >= 0){
            dp[i] = Math.max(dp[i], dp[i-cost] + memory);}
        }

        solve(index + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //동전의 개수
        int M = Integer.parseInt(st.nextToken());
        MemArr = new int[N+1];
        costArr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) { //1~N
            MemArr[i] = Integer.parseInt(st.nextToken());
        }

        costSum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) { //1~N
            costArr[i] = Integer.parseInt(st.nextToken());
            costSum += costArr[i];
        }

        dp = new int[costSum+1];

        solve(1);

        for(int i = 0; i < dp.length; i++){
            if(dp[i] >= M) {System.out.println(i);
            break;}

        }

    }
}