import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static long[][] dist;
    private static int N;

    static void floyd(){
        for(int k = 1; k <= N; k++){//k번 노드 거쳐가는거 다 검사
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(i==j && dist[i][j] == 0){//첫번째
                        dist[i][j] =  dist[i][k] + dist[k][j];
                    }else dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]); //k번 거쳐가는거하고 기존꺼하고 비교
                }
            }
        }

    }


    public static void main (String[]args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    N = Integer.parseInt(st.nextToken()); //도시 수
                    int M = Integer.parseInt(st.nextToken()); //버스수

                    dist = new long[N+1][N+1];

                    for(int i = 1; i <= N; i++){

                        for(int j = 1; j <=N; j++){
                            if(i==j)continue; //0이면 자기자신으로 가는거다
                            dist[i][j] = Integer.MAX_VALUE;
                        }
                    }

                    for(int i = 0; i < M; i++){
                        st = new StringTokenizer(br.readLine());
                        int start = Integer.parseInt(st.nextToken());
                        int end = Integer.parseInt(st.nextToken());
                        int cost = Integer.parseInt(st.nextToken());

                        if(dist[start][end] != Integer.MAX_VALUE){
                            dist[start][end] = Math.min(dist[start][end], cost); //들어올때 간선 여러개면 작은 거 선택
                        }else dist[start][end] = cost;
                    }


                    floyd();

                    long min = Integer.MAX_VALUE;
                    for(int i = 1; i <= N; i++){
                            min = Math.min(min, dist[i][i]);
                        }




                    if(min == Integer.MAX_VALUE || min == 0){
                        System.out.println(-1);
                    }else System.out.println(min);
                }
            }

