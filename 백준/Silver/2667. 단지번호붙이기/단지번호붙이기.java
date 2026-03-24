import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static final int[] dx = {0,0,-1,1};
    private static final int[] dy = {1,-1,0,0};

    private static boolean[][] visited;
    private static int[][] map;
    private static LinkedList<Integer> apartArr = new LinkedList<>();
    private static int cnt;

    private static void dfs(int row, int col){
        visited[row][col] = true;
        cnt++;

        for(int i = 0; i < 4; i++){
            if(row+dx[i] >= 0 && row + dx[i] < map.length && col+dy[i] >= 0 && col + dy[i] < map.length){
                if(!visited[row+dx[i]][col+dy[i]] && map[row+dx[i]][col+dy[i]] == 1){
                    dfs(row+dx[i],col+dy[i]);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i < N; i++){
            String a = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = a.charAt(j) - '0';
            }
        }

        visited = new boolean[N][N];


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                cnt = 0;
                dfs(i,j);
                apartArr.add(cnt);}
            }
        }

        Collections.sort(apartArr);


        System.out.println(apartArr.size());
        for(int i : apartArr){
            System.out.println(i);
        }


    }
}


