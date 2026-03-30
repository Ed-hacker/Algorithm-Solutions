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
    static int V;
    static ArrayList<Node>[] adj;
    static PriorityQueue<Node> que;
    static int[] dist;

    static void bfs(int K){//시작정점
        dist = new int[V+1];
        for(int i =1; i <= V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[K] = 0;

        que = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);

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
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int test_case = 0; test_case < T; test_case++) {
            PriorityQueue<Integer> result = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());//노드 갯수 n
            int E = Integer.parseInt(st.nextToken()); //간선 갯수  m
            int t = Integer.parseInt(st.nextToken()); //목적지 후보 갯수


            adj = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                adj[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //출발지
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());


                adj[from].add(new Node(to, value));
                adj[to].add(new Node(from, value));
            }



            bfs(s);
            int[] dist1 = dist;
            int oneToa = dist1[a];
            int oneTob = dist1[b];

            bfs(a);
            int[] dist2 = dist;

            bfs(b);
            int[] dist3 = dist;


            for(int i = 0; i < t; i++){
                int end = Integer.parseInt(br.readLine());
                int oneToN = dist1[end];

                int aToN = dist2[end];
                int aTob = dist2[b];
                
                int bToN = dist3[end];

                if(oneToN == oneToa + bToN + aTob || oneToN == oneTob + aToN + aTob){
                    result.add(end);
                }
            }
            while(!result.isEmpty()){
                sb.append(result.poll()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}