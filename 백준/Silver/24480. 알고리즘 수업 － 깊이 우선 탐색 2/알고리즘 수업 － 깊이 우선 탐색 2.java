import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static ArrayList<Integer> [] adj;
    private static int N;
    private static int cnt = 1;
    private static int[] order;

    private static void dfs(int R){
        order[R] = cnt++;
        for(int next : adj[R]){
            if(order[next] == 0){//방문 안 했다면
            dfs(next);}
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];

        order = new int[N+1];

        for(int i = 0; i <= N; i++){
            adj[i] = new ArrayList<>();
        } //각 노드마다 리스트 초기화

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for(int i = 1; i<=N; i++) Collections.sort(adj[i], Collections.reverseOrder());


        dfs(R);
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            sb.append(order[i]).append("\n"); //방문 순서 출력 (안 갔으면 0 출력됨)
        }
        System.out.println(sb);

    }
}




