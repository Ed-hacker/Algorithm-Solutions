import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class Node{
        int to; int value;
        Node( int to, int value){
            this.to = to;
            this.value = value;
        }
    }

    static ArrayList<Node>[] adj;
    static PriorityQueue<Node> que;
    static int[] dist;

    static void bfs(int K){//시작정점
        dist[K] = 0;
        que.add(new Node(K,0));

        while(!que.isEmpty()){
            Node now = que.poll();
            int current_dist = now.value;

            if(dist[now.to] < current_dist)continue; //이미 최단거리가 등록되어있으므로 continue(스킵)

            for(Node next : adj[now.to]){
                if(current_dist+next.value < dist[next.to]){
                    dist[next.to] = current_dist+next.value;
                    que.add(new Node(next.to, current_dist+next.value));
                    }
                }
            }

        }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());//노드 갯수
        int E= Integer.parseInt(st.nextToken()); //간선 갯수

        int K = Integer.parseInt(br.readLine()); //시작 정점

        dist = new int[V+1];


        que = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);
        adj = new ArrayList[V+1];
        for(int i =1; i <= V; i++){
            dist[i] = Integer.MAX_VALUE;
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            adj[from].add(new Node(to,value));
        }


        bfs(K);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < dist.length; i++){
            if(dist[i] == Integer.MAX_VALUE) sb.append("INF").append("\n");
            else sb.append(dist[i]).append("\n");
        }

        System.out.println(sb);


    }
}