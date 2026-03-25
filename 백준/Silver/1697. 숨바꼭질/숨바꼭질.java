import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static boolean[] visited = new boolean[100001];
    private static int[] map = new int [100001];
    private static Queue<Integer> que = new LinkedList<>();


    private static int bfs(int N, int K){
        visited[N] = true;
        que.add(N);

        while(!que.isEmpty()){
            int now = que.poll();
            if(now == K)return map[now];

            if(now - 1 >= 0 && now -1 <= 100000){
                if(!visited[now -1]){
                    visited[now -1] = true;
                    map[now -1] = map[now] + 1;
                    que.add(now -1);
                }
            }

            if(now + 1 >= 0 && now + 1 <= 100000){
                if(!visited[now +1]){
                    visited[now +1] = true;
                    map[now +1] = map[now] + 1;
                    que.add(now +1);
                }
            }

            if(now*2 >= 0 && now*2 <= 100000){
                if(!visited[now*2]){
                    visited[now*2] = true;
                    map[now*2] = map[now] + 1;
                    que.add(now*2);
                }
            }
        }


        return 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수빈이가 있는 위치
        int K = Integer.parseInt(st.nextToken()); //동생이 있는 위치



        System.out.println(bfs(N,K));
        }
    }



