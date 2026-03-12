import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static long N;
    static long sum;
    static long[] node_Arr;
    static long[] distance_Arr;

    static void calculate(long now_Node){
        if(now_Node == N-1){
            return;
        }
        for(int i = Math.toIntExact(now_Node); i < N; i++){
            if(node_Arr[Math.toIntExact(now_Node)] > node_Arr[i] || i == N-1){
                for(int j = Math.toIntExact(now_Node); j < i; j++){
                    sum += node_Arr[Math.toIntExact(now_Node)] * distance_Arr[j];
                }
                calculate(i);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        node_Arr = new long[Math.toIntExact(N)];
        distance_Arr = new long[Math.toIntExact(N)];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++){
            distance_Arr[i] = Long.parseLong(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            node_Arr[i] = Long.parseLong(st2.nextToken());
        }

        calculate(0);


        System.out.println(sum);

    }
}