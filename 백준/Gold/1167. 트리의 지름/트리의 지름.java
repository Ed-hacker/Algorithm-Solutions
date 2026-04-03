import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int maxDist = 0;
    static int farNode = 0;
    static boolean[] visited;
    static ArrayList<Point>[] adj;

    static class Point{
        int to;
        int value;
        Point(int to, int value){
            this.to = to;
            this.value = value;
        }
    }

    static void dfs(int now, int dist){ //1번을 루트로 설정
        visited[now] = true;

        if(dist > maxDist){
            maxDist = dist;
            farNode = now;
        }

        for(Point here : adj[now]){
            int next = here.to; //next는 다음거
            if(!visited[next]){//방문 안한거면 == 부모 노드가 아니면
               dfs(next, dist + here.value);//dfs == next까지의 최대 // + 지금 간선 value
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        adj = new ArrayList[n+1]; //인접리스트

        for(int i = 1; i <= n; i++ ){
            adj[i] = new ArrayList<>();
        }//인접리스트 초기화

        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int now = Integer.parseInt(st.nextToken());
            while(true){
            int to = Integer.parseInt(st.nextToken());
            if(to == -1)break;

            int value = Integer.parseInt(st.nextToken());
            adj[now].add(new Point(to,value));
            }
        }//간선 다 넣기


        dfs(1,0);

        visited = new boolean[n+1]; //다시 초기화
        maxDist = 0; //거리도 초기화
        dfs(farNode , 0);

        System.out.println(maxDist);



    }
}
