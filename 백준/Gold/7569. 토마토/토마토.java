import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static boolean[][][] visited;
    private static int[][][] map;
    private static Queue<Point> que = new LinkedList<>();
    private static int cnt = 0;
    private static final int[] dx = {0, 0, -1, 1,0,0};
    private static final int[] dy = {1,-1, 0, 0,0,0};
    private static final int[] dz = {0,0, 0, 0,1,-1};


    static class Point{
        int x; int y;int z;

        Point(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;

        }
    }



    private static int bfs(){

        while(!que.isEmpty()){
            Point now = que.poll();

            for(int i = 0; i < 6; i++){
                if(now.x + dx[i] >= 0 && now.x + dx[i] < map.length
                && now.y + dy[i] >= 0 && now.y + dy[i] < map[0].length
                        && now.z + dz[i] >= 0 && now.z + dz[i] < map[0][0].length){
                    if(map[now.x + dx[i]][now.y + dy[i]][now.z + dz[i]] == 0 && !visited[now.x + dx[i]][now.y + dy[i]][now.z + dz[i]]){
                        que.add(new Point(now.x + dx[i],now.y + dy[i],now.z + dz[i]));
                        visited[now.x + dx[i]][now.y + dy[i]][now.z + dz[i]] = true;
                        map[now.x + dx[i]][now.y + dy[i]][now.z + dz[i]] = map[now.x][now.y][now.z] + 1;
                        cnt--;
                        if(cnt == 0)return map[now.x][now.y][now.z];
                    }

                }
            }

        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        map = new int[M][N][H];
        visited = new boolean[M][N][H];
        for(int k = 0; k < H; k++){
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j][k] = Integer.parseInt(st.nextToken());
                if(map[i][j][k] == 0) cnt++;
                else if(map[i][j][k] == 1){
                    que.add(new Point(i,j,k));
                }
            }
        }}


        if(cnt == 0) System.out.println(0);
        else System.out.println(bfs());
        }
    }



