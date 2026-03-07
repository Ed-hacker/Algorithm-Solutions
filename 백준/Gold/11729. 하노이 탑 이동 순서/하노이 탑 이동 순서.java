import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    public static void hanoi(int n, int start, int mid, int end){
        if(n==1){
            count++;
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }
            hanoi(n-1, start, end, mid);

            count++;
            sb.append(start).append(" ").append(end).append("\n");

            hanoi(n-1, mid , start , end);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N,1,2,3);
        System.out.println(count);
        System.out.println(sb);
        }
}
