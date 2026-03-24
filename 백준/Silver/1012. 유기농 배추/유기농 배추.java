import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static final int[] dx = {0,0,-1,1};
    private static final int[] dy = {1,-1,0,0};
    private static boolean[][] visited;
    private static int[][] map;
    private static int cnt;

    private static void dfs(int row, int col){
        visited[row][col] = true;

        for(int i = 0; i < 4; i++){
            if(row+dx[i] >= 0 && row + dx[i] < map.length && col+dy[i] >= 0 && col + dy[i] < map[0].length){
                if(!visited[row+dx[i]][col+dy[i]] && map[row+dx[i]][col+dy[i]] == 1){
                    dfs(row+dx[i],col+dy[i]);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visited = new boolean[N][M];
            cnt = 0;
            for (int a = 0; a < K; a++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        cnt++;
                        dfs(x, y);
                    }
                }
            }

            System.out.println(cnt);


        }

    }
}


