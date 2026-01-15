import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 1; i <= N; i++){
            list.offer(i);
        }
        while(list.size() != 1){
            for(int i = 0; i < M-1; i++){
                list.add(list.poll());
            }
            sb.append(list.poll()).append(", ");

        }

        sb.append(list.poll()).append(">");

        System.out.println(sb);

    }
}


