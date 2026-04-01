import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int[] parent;
    static ArrayList<Integer>[] adj;
    static Queue<Integer> que = new ArrayDeque<>();

    static void bfs(){
        que.add(1);
        parent[1] = 1;
        while(!que.isEmpty()){//빌떄까지 계속
            int next = que.poll();

            for(int a : adj[next]){
                if(parent[a] != 0) continue;
                parent[a] = next;
                que.add(a);
            }

        }



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //수열 크기
        parent = new int[n+1]; //누가 부모인지 표시
        adj = new ArrayList[n+1]; //인접리스트

        for(int i = 1; i <= n; i++ ){
            adj[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int to = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            adj[to].add(from);
            adj[from].add(to); //양쪽으로 넣기
        }//간선 다 넣기


        bfs();

        StringBuilder sb = new StringBuilder();
        for(int i = 2;i <= n; i++ ){
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);

    }
}
