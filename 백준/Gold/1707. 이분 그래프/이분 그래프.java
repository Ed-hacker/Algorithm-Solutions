import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.*;

class Main {
    static int[] colors; //기본색 1, 반대는 -1, 안 칠한거 0
    static boolean[] visited;
    static ArrayList<Integer>[] adj;
    static boolean isBipartite;



    static void dfs(int vertex, int color){
        visited[vertex] = true;
        colors[vertex] = color;
        for( int end : adj[vertex]){
            if(visited[end] && colors[end] == color) {//방문한 적 있는데 색이 두개가 같으면 이분그래프 성립 x
                isBipartite = false;
                return;
            }else if(!visited[end]){
                dfs(end, -color); //방문한 적 없으면 -color 쥐어서 되돌려보냄
            }
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            visited = new boolean[V+1];
            adj = new ArrayList[V+1];
            isBipartite = true;
            colors = new int[V+1];

            for(int k = 1; k <= V; k++){
                adj[k] = new ArrayList<>();
            }

            for(int j = 0; j < E; j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                adj[start].add(end);
                adj[end].add(start);
            }

            for(int x = 1; x <= V; x++){
                if(!visited[x]){
                    dfs(x,1);
                }
            }

            if(isBipartite) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}