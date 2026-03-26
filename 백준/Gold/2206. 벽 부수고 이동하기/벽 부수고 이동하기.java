import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {1, -1, 0, 0 };
    public static int[][][] board;
    public static  boolean[][][] visited;

    static class Point{
        int x; int y;
        boolean crush;
        Point(int x, int y, boolean crush){
            this.x = x;
            this.y = y;
            this.crush = crush;
        }
    }

    private static void bfs() {
        Queue<Point> que = new ArrayDeque<>();
        visited[0][0][0] = true;
        board[0][0][1] = 1; //벽 안 뿌슨거 늘려주기   0은 벽 유무 확인용(원래 map)


        que.add(new Point(0, 0, false)); // 0,0에서 안 뿌순 상태 add


        while (!que.isEmpty()) {
            Point now = que.poll();

            for (int i = 0; i < 4; i++) {
                if (now.x + dx[i] >= 0 && now.x + dx[i] < board.length
                        && now.y + dy[i] >= 0 && now.y + dy[i] < board[0].length) { //길이 조건 체크
                    if (board[now.x + dx[i]][now.y + dy[i]][0] == 1) {//다음께 벽이면!
                        if (now.crush) continue; //뿌순 애면 다음꺼로 넘어가 (아무것도 하지마)
                        else if (!visited[now.x + dx[i]][now.y + dy[i]][1]) {//안 뿌순애면 뿌수는거 추가해, 상태 전이
                            que.add(new Point(now.x + dx[i], now.y + dy[i], true));
                            board[now.x + dx[i]][now.y + dy[i]][2] = board[now.x][now.y][1] + 1;//거리 늘려주기
                            visited[now.x + dx[i]][now.y + dy[i]][1] = true; //뿌순애 꺼는 1
                        }
                    } else {//벽이 아니면!
                        if (now.crush && !visited[now.x + dx[i]][now.y + dy[i]][1]) { //뿌순 애면
                            que.add(new Point(now.x + dx[i], now.y + dy[i], true));
                            board[now.x + dx[i]][now.y + dy[i]][2] = board[now.x][now.y][2] + 1;//전에 뿌순 애에 거리 늘려주기
                            visited[now.x + dx[i]][now.y + dy[i]][1] = true; //뿌순애 꺼는 1
                        } else if (!now.crush && !visited[now.x + dx[i]][now.y + dy[i]][0]) { //안 뿌순 애면
                            que.add(new Point(now.x + dx[i], now.y + dy[i], false));
                            board[now.x + dx[i]][now.y + dy[i]][1] = board[now.x][now.y][1] + 1;//전에 뿌순 애에 거리 늘려주기
                            visited[now.x + dx[i]][now.y + dy[i]][0] = true; //안 뿌순애 꺼는 0
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

        board = new int[N][M][3]; //맨 뒤에는 원래 보드, 벽 안 부수고 최소, 벽 부수고 최소 구분점
        visited = new boolean[N][M][2]; //0은 안 뿌순 애 꺼, 1은 뿌순 얘 꺼

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j][0] = str.charAt(j) - '0';
            }
        }

        bfs();

        if(board[N-1][M-1][1]==0 && board[N-1][M-1][2] == 0) System.out.println(-1);
        else if(board[N-1][M-1][1]==0) System.out.println(board[N-1][M-1][2]);
        else if(board[N-1][M-1][2]==0) System.out.println(board[N-1][M-1][1]);
        else System.out.println(Math.min(board[N-1][M-1][1],board[N-1][M-1][2]));




    }
}