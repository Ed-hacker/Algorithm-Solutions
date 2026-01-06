import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        } //일단 다 넣어

        StringBuilder sb = new StringBuilder();


        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            if(set.contains(Integer.parseInt(st2.nextToken())))sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }


        System.out.println(sb);
            }
}


