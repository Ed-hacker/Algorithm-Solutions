import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] indegree;
    static int N;
    static ArrayList<Integer>[] adj;
    static ArrayList<Integer> result;
    static PriorityQueue<Integer> que;



    static int topologicalSort(){
        for(int i = 1; i <= N; i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        while(!que.isEmpty()){
            if(que.size() > 1)return -1; //2개 이상이면 ?

            int next = que.poll();
            result.add(next);

            for(int i = 1; i <= N; i++){
                indegree[i]--;
                if(indegree[i] == 0)que.add(i);
            }//연결되어 있던 정점들의 진입차수를 1씩 빼준다
        }
        return 0; //끝남
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스
        for (int t = 0; t < T; t++) {
            N = Integer.parseInt(br.readLine());
            indegree = new int[N + 1]; //진입차수



            adj = new ArrayList[N + 1]; //인접리스트
            result = new ArrayList<>();
            que = new PriorityQueue<>();

            for (int k = 1; k <= N; k++) {
                adj[k] = new ArrayList<>();
            } //각 방 초기화


            // 1. 작년 순위를 배열에 저장해서 "누가 원래 더 잘했는지" 기록해둡니다.
            int[] rank = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int team = Integer.parseInt(st.nextToken());
                indegree[team] = i;
                rank[team] = i; // ★ 핵심: 이 팀의 원래 등수(0등~N-1등)를 기억해둠!
            }

// 2. 순위가 바뀐 팀 입력받기
            int M = Integer.parseInt(br.readLine());
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                // ★ 진짜 범인 검거 완료! 누가 원래 잘했는지 비교해서 조절합니다.
                if (rank[a] < rank[b]) { // 원래 a가 순위가 높았다면 (a가 이기고 있었다면)
                    // 이제 b가 이기므로, a는 지는 횟수 추가, b는 지는 횟수 감소
                    indegree[a]++;
                    indegree[b]--;
                } else { // 원래 b가 순위가 높았다면
                    indegree[b]++;
                    indegree[a]--;
                }
            }



            if(topologicalSort() == -1){
                System.out.println("?");
            }else if(result.size() != N) System.out.println("IMPOSSIBLE");
            else{
            StringBuilder sb = new StringBuilder();
            for (int i : result) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);}
        }

    }
}