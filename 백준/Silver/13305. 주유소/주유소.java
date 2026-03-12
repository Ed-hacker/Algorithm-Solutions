import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int sum;
    static int[] node_Arr;
    static int[] distance_Arr;

    static void calculate(int now_Node){
        if(now_Node == N-1){
            return;
        }
        for(int i = now_Node; i < N; i++){
            if(node_Arr[now_Node] > node_Arr[i] || i == N-1){
                for(int j = now_Node; j < i; j++){
                    sum += node_Arr[now_Node] * distance_Arr[j];
                }
                calculate(i);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        node_Arr = new int[N];
        distance_Arr = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++){
            distance_Arr[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            node_Arr[i] = Integer.parseInt(st2.nextToken());
        }

        calculate(0);


        System.out.println(sum);

    }
}