import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static long[] dist;
    private static ArrayList<Node>[] que;
    private static int N;

    static class Node{
        int end;
        int cost;
        Node(int end,int cost){
            this.end = end;
            this.cost = cost;
        }
    }

    static void belFor(){

        for(int i = 0; i <N-1; i++){
            for(int j = 1; j <= N; j++ ) {
                for (Node now : que[j]) { //j = start
                    int now_end = now.end;
                    int now_cost = now.cost;

                    if (dist[j] != Integer.MAX_VALUE && dist[now_end] > dist[j] + now_cost) {
                        dist[now_end] = dist[j] + now_cost;
                    }
                }
            }
        }

        for(int j = 1; j <= N; j++ ){
            for(Node now : que[j]){
                int now_end = now.end;
                int now_cost = now.cost;

                if(dist[j] != Integer.MAX_VALUE && dist[now_end] > dist[j] + now_cost){
                    dist[j] = Integer.MIN_VALUE;
                }
            }
        }
    }



    public static void main (String[]args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    N = Integer.parseInt(st.nextToken()); //도시 수
                    int M = Integer.parseInt(st.nextToken()); //버스수

                    dist = new long[N+1];

                    que = new ArrayList[N+1]; //간선을 넣기 위한 인접리스트

                    for(int i = 1; i <= N; i++){
                        que[i] = new ArrayList<>();
                    }
                    for(int i = 0; i < M; i++){
                        st = new StringTokenizer(br.readLine());
                        int start = Integer.parseInt(st.nextToken());
                        int end = Integer.parseInt(st.nextToken());
                        int cost = Integer.parseInt(st.nextToken());

                        que[start].add(new Node(end,cost));
                    }

                    for(int i = 2; i <= N; i++){  //1은 출발점이니까 0으로 시작
                        dist[i] = Integer.MAX_VALUE;
                    }

                    belFor();

                    boolean isCycle = false;
                    for(int i = 1; i <= N; i++){
                        if(dist[i] == Integer.MIN_VALUE){
                            System.out.println(-1);
                            isCycle = true;
                            break;
                        }
                    }

                    if(!isCycle){
                    for(int i = 2; i <= N; i++){
                        if( dist[i] == Integer.MAX_VALUE) System.out.println(-1);
                        else System.out.println(dist[i]);
                    }
                    }
                }
            }

