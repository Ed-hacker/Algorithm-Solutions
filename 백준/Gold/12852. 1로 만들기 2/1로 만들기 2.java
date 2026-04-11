import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int [] dp; //dp는 이 비용을 들였을 때, 내가 얻을 수 있는 메모리의 최대치


    static void bfs() {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(N);

        while(!que.isEmpty()){
            int now = que.poll();

            if(now == 1)break;

            if(now%3 == 0 && dp[now/3] == 0){
                que.add(now/3);
                dp[now/3] = now;
            }

            if(now%2 == 0 && dp[now/2] == 0){
                que.add(now/2);
                dp[now/2] = now;
            }

            if(dp[now-1] == 0){
                que.add(now-1);
                dp[now-1] = now;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1]; // N까지!

        bfs();

        int now = 1;
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        int cnt = 0;
        while(now != N){
            cnt++;
            stack.add(dp[stack.peek()]);
            now = stack.peek();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");

        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
    }
}