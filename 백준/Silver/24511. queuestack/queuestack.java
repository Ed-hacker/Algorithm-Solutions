import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //4

        int[] arr = new int[N]; //큐인지 스택인지 0110
        Deque<Integer> deck = new ArrayDeque<>(); // 큐만 넣을 덱


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } //큐인지 스택인지  0110

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st1.nextToken());
            if(arr[i] == 0){
                deck.addFirst(a);
            } //큐일때만 앞으로 추가
        } //41

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb =new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            deck.addLast(Integer.parseInt(st2.nextToken()));
        }//41247

        for(int i = 0; i < M; i++){
            sb.append(deck.pollFirst()).append(" ");
        }

        System.out.println(sb);



    }
}



