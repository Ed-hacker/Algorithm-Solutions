import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int k = 0; k < q; k++){
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            if(key == 1){
                int x1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());

                int[] temp = arr[x1];
                arr[x1] = arr[x2];
                arr[x2] = temp;
            }
            else{
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                arr[i][j] = value;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                bw.write(String.valueOf(arr[i][j]));
                if(j < M-1) bw.write(" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();


    }
}