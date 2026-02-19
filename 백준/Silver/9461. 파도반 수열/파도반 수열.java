import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] arr = new Long[101];

        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        for (int i = 4; i <= 100; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }

        for(int j = 0; j < N; j++){
            int M = Integer.parseInt(br.readLine());
            System.out.println(arr[M]);
        }






    }
}