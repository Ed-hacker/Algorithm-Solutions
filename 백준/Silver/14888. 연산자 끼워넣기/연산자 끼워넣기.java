import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] arr;
    static int[] operator;
    static int max,min;

    public static void calculate(int result, int n){ //n은 이번에 몇번째 수 적용할건지 result는 전에꺼 결과
        if(arr.length <= n){
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(operator[i] > 0){
                operator[i]--;
                if(i == 0)   calculate(result + arr[n] , n+1); //덧셈
                else if(i== 1) calculate(result - arr[n], n+1); //뺄셈
                else if(i == 2)  calculate(result * arr[n], n+1); //곱셈
                else if(i == 3) calculate(result / arr[n], n+1); //나눗셈
                operator[i]++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int j = 0; j < 4; j++){
            operator[j] = Integer.parseInt(st2.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        calculate(arr[0],1);
        System.out.println(max);
        System.out.println(min);



        }
}
