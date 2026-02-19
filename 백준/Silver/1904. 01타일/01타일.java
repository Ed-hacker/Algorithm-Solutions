import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] arr = new Long[N+1];
        if(N==1) System.out.println(1);
        else {
            arr[1] = 1L;
            arr[2] = 2L;

            for (int i = 3; i <= N; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
            }

            System.out.println(arr[N]);

        }




    }
}