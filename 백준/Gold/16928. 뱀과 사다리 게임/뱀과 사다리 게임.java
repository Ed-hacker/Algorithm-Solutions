import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static boolean[] visited = new boolean[101];
    private static int[] board = new int[101];
    private static Queue<Integer> que = new LinkedList<>();
    private static Map<Integer, Integer> map = new HashMap<>();


    private static int bfs() {
        visited[1] = true;
        que.add(1);


        while (!que.isEmpty()) {
            int now = que.poll();

            if(now == 100) return board[100];


            for (int i = 1; i <= 6; i++) {
                int next = now + i;
                
                if (next > 100) continue;

                if(map.containsKey(next)) next = map.get(next);

                if(!visited[next]){
                   board[next] = board[now] + 1;
                   visited[next] = true;
                   que.add(next);
                }
            }
        }
    return board[100];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            map.put(from, to);
        }
        System.out.println(bfs());
    }
}