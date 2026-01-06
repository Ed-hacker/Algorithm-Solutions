import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            map.put(br.readLine(),1);
        } //일단 다 넣어

        for(int i = 0; i < M; i++){
            String a = br.readLine();
            if(map.containsKey(a)) list.add(a);
        }

        Collections.sort(list); //사전순으로 정렬

        StringBuilder sb = new StringBuilder();

        sb.append(list.size()).append("\n");
        for(String name : list){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
        
        }
}




