import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static ArrayList<Integer> [] adj;
    private static int N;
    private static int cnt = 0;
    private static boolean[] visited;
    private static Queue<Integer> queue = new LinkedList<>();

    private static void bfs(int R){
        queue.add(R);
        while(!queue.isEmpty()){
            for(int next: adj[queue.poll()]){
                if(!visited[next]){//방문 안 했다면
                    visited[next] = true;
                    cnt++;
                    queue.add(next);}
                }
            }
        }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];


        for(int i = 0; i <= N; i++){
            adj[i] = new ArrayList<>();
        } //각 노드마다 리스트 초기화

        for(int i = 0; i < M; i++){
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for(int i = 1; i<=N; i++) Collections.sort(adj[i]);


        visited[1] = true;
        bfs(1);

        System.out.println(cnt);

    }
}


