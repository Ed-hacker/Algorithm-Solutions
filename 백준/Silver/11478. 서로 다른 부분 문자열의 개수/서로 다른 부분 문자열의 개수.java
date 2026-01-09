import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int N = s.length();

        Set<String> set = new HashSet<>();

        for(int i = 1; i <= N; i++){ //슬라이스 갯수 단위
            for(int j = 0; j < N-i+1; j++){//시작 좌표
                String slice = s.substring(j,j+i);
                set.add(slice);
            }
        } //일단 다 넣어


        System.out.println(set.size());



        }
}





