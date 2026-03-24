import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static final int[] dx = {0,0,-1,1};
    private static final int[] dy = {1,-1,0,0};
    private static boolean[][] visited;
    private static int[][] map;
    private static Queue<Point> que = new LinkedList<>();

    static class Point{
        int x; int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static void bfs(){
        visited[0][0] = true;
        que.add(new Point(0,0));
        map[0][0] = 1;

        while(!que.isEmpty()){
            Point now = que.poll();
            int row = now.x;
            int col = now.y;

            if(row == map.length-1 && col  == map[0].length-1){
                return;
            }

            for(int i = 0 ; i < 4; i++){
                if(row+dx[i] >= 0 && row+dx[i] < map.length && col + dy[i] >= 0 && col + dy[i] < map[0].length){
                    if(map[row+dx[i]][col+dy[i]]== 1 && !visited[row+dx[i]][col+dy[i]]){
                        visited[row+dx[i]][col+dy[i]] = true;
                        map[row+dx[i]][col+dy[i]]= map[row][col] + 1;
                        que.add(new Point(row+dx[i],col+dy[i]));
                        if(row+dx[i] == map.length-1 && col + dy[i] == map[0].length-1){
                            return;
                        }
                    }
                }
            }

        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String a = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = a.charAt(j) - '0';
            }
        }

        bfs();

        System.out.println(map[N-1][M-1]);


        }

    }



