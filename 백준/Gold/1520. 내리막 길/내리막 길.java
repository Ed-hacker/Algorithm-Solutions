import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int M;
    static int N;
    static int[][] map;
    static int[][] dp;
    static int dfs(int r, int c){
        if(r == M-1 && c == N-1){
            return 1;
        }//종료조건

        if (dp[r][c] != -1) return dp[r][c]; //이미 수사한 곳인지 확인

        dp[r][c] = 0;
        for(int i = 0; i < 4; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];
            if(nr >= 0 && nr < M && nc >= 0 && nc < N &&  map[r][c] > map[nr][nc]){//갈 수 있는데면
                dp[r][c] += dfs(nr,nc);
            }
        }

        return dp[r][c];
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); //행
        N = Integer.parseInt(st.nextToken()); //열
        map = new int[M][N];
        dp = new int[M][N];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j]  = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        } //map 받아오기

        System.out.println(dfs(0,0));



    }
}