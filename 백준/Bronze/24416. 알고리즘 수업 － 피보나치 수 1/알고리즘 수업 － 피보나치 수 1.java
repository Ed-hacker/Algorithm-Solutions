import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static int[] arr;
    public static int count1;
    public static int count2;
    private static void recursion(int N){
        if(N==1 || N==2){
            count1++;
        }
        else {recursion(N-1);
            recursion(N-2);
        }
    }

    private static void dp(int N){

        for(int i = 3; i <= N; i++){
            arr[i] = arr[i-1] + arr[i-2];
            count2++;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        arr[1] = 1;
        arr[2] = 1;

        recursion(N);
        dp(N);
        System.out.println(count1 + " " + count2);
    }
}