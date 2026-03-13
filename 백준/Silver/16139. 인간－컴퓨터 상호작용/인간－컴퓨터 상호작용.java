import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int[][] sumArr = new int[128][str.length()+1];

        for(int i = 97; i < 128; i++){
            for(int j = 1; j < str.length()+1; j++){
                if(str.charAt(j-1) == (char)i){
                    sumArr[i][j] = sumArr[i][j-1] + 1;  //j는 1부터 시작
                }else sumArr[i][j] = sumArr[i][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String target = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(sumArr[target.charAt(0)][r+1]-sumArr[target.charAt(0)][l]).append("\n");
        }

        System.out.println(sb);



    }
}


