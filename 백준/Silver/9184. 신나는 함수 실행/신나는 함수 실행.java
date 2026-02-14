import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static int[][][] arr;

    private static int calculate(int a, int b, int c){
        if(a <=0 || b<=0 || c<=0)return 1;
        else if(a > 20 || b > 20 || c > 20)return arr[20][20][20];
        else if(a<b && b<c) return arr[a][b][c-1] + arr[a][b-1][c-1] - arr[a][b-1][c];
        else return arr[a-1][b][c] + arr[a-1][b-1][c] + arr[a-1][b][c-1] - arr[a-1][b-1][c-1];
    } //only 계산


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[21][21][21];
        for(int i = 0; i < 21; i++){
            for(int j = 0; j < 21; j++){
                for(int k = 0; k < 21; k++){
                    arr[i][j][k] = calculate(i,j,k);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1)break;

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(calculate(a, b, c)).append("\n");
        }
        System.out.println( sb);

    }
}