import java.io.*;
import java.util.*;


class Main {

    public static void forward(Deque<Integer> deck,Deque<Integer> deck2) {//정방향
        int N = Math.abs(deck.pollFirst());
        int M = deck2.pollFirst();
        for(int i = 0; i < N-1; i++ ){
            deck.addLast(deck.pollFirst()); //첫번째꺼 빼서 뒤로 보내자
            deck2.addLast(deck2.pollFirst());
        }

        System.out.print(M + " ");

    }

    public static void backward(Deque<Integer> deck ,Deque<Integer> deck2) {//역방향
        int N = Math.abs(deck.pollFirst());
        int M = deck2.pollFirst();
        for(int i = 0; i < N; i++ ){
            deck.addFirst(deck.pollLast()); //첫번째꺼 빼서 뒤로 보내자
            deck2.addFirst(deck2.pollLast());
        }

        System.out.print(M + " ");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deck = new ArrayDeque<>();
        Deque<Integer> deck2 = new ArrayDeque<>(); //번호 넣어둔거


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){
            deck.addLast(Integer.parseInt(st.nextToken()));
            deck2.addLast(i);
        } //일단 다 넣기 (뒤로 넣기)

        for(int i = 0; i < N-1; i++){
            if(deck.peekFirst() > 0) forward(deck,deck2);
            else backward(deck,deck2);

        }

        System.out.print(deck2.pollFirst());


    }
}


