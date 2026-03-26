import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static final int[] dx = {-2,-1, 1, 2,-2,-1, 1, 2};
    static final int[] dy = {1, 2, 2, 1,-1,-2, -2, -1};


    static class Point{
        int x; int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }



    private static int bfs(Point start, Point target,int l) {
        Queue<Point> que = new LinkedList<>();
        int[][] board = new int[l][l];
        boolean[][] visited = new boolean[l][l];
        visited[start.x][start.y] = true;
        que.add(start);


        while (!que.isEmpty()) {
            Point now = que.poll();
            if(now.x == target.x && now.y == target.y) return board[now.x][now.y];

            for (int i = 0; i < 8; i++) {
                Point next = new Point(now.x+dx[i],now.y+dy[i]);
                if(next.x >= 0 && next.x < l && next.y >= 0 && next.y < l ){
                    if(!visited[next.x][next.y]){
                      que.add(next);
                      visited[next.x][next.y] = true;
                      board[next.x][next.y] = board[now.x][now.y] + 1;

                     
                    }
                }



            }
        }

        return board[target.x][target.y];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int l = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            Point start = new Point(startX, startY );

            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());
            Point target = new Point(targetX, targetY);
            System.out.println(bfs(start, target, l));
        }





    }
}