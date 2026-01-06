import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        Map<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            if(!map.containsKey(number))map.put(number,1); //없으면 1 넣기
            else map.put(number,map.get(number)+1); //있으면 +1
        } //일단 다 넣어

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< M; i++){
            int a = Integer.parseInt(st2.nextToken());
            if(map.containsKey(a)) sb.append(map.get(a)).append(" ");
            else sb.append(0).append(" ");
        }


        System.out.println(sb);


        }
}





