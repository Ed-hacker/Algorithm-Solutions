import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static ArrayList<Integer> [] adj;
    private static int N;
    private static boolean[] visitedBfs;
    private static boolean[] visitedDfs;
    private static Queue<Integer> queue = new LinkedList<>();
    private static StringBuilder sb = new StringBuilder();

    private static void dfs(int R){
        visitedDfs[R] = true;
        sb.append(R).append(" ");
        for(int next : adj[R]){
            if(!visitedDfs[next]){
                dfs(next);
            }
        }
    }

    private static void bfs(int R){
        visitedBfs[R] = true;
        queue.add(R);
        sb.append(R).append(" ");
        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int next: adj[a]){
                if(!visitedBfs[next]){//방문 안 했다면
                    sb.append(next).append(" ");
                    visitedBfs[next] = true;
                    queue.add(next);}
                }
            }
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        visitedBfs = new boolean[N+1];
        visitedDfs = new boolean[N+1];


        for(int i = 0; i <= N; i++){
            adj[i] = new ArrayList<>();
        } //각 노드마다 리스트 초기화

        for(int i = 0; i < M; i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for(int i = 1; i<=N; i++) Collections.sort(adj[i]);

        dfs(R);
        sb.append("\n");
        bfs(R);


        System.out.println(sb);
    }
}


