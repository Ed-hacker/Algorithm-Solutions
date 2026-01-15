import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            list.offer(i);
        }
        while(list.size() != 1){
            list.poll();
            list.offer(list.poll());

        }

        System.out.println(list.peek());

    }
}


