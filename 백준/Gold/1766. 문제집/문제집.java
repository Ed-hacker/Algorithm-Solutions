import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] indegree;
    static int N;
    static ArrayList<Integer>[] adj;
    static ArrayList<Integer> result = new ArrayList<>();
    static PriorityQueue<Integer> que = new PriorityQueue<>();



    static void topologicalSort(){
        for(int i = 1; i <= N; i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }

        while(!que.isEmpty()){
            int next = que.poll();
            result.add(next);

            for(int i : adj[next]){
                --indegree[i];
                if(indegree[i]==0) que.add(i);
            } //연결되어 있던 정점들의 진입차수를 1씩 빼준다
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        indegree = new int[N+1];
        adj = new ArrayList[N+1];

        for(int t = 1; t <= N; t++){
            adj[t] = new ArrayList<>();
        } //각 방 초기화

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int small = Integer.parseInt(st.nextToken());
            int tall = Integer.parseInt(st.nextToken());
            adj[small].add(tall);
            indegree[tall]++;
        } //간선 전부 넣어주기

        topologicalSort();


        StringBuilder sb = new StringBuilder();
        for(int i : result){
            sb.append(i).append(" ");
        }

        System.out.println(sb);

    }
}