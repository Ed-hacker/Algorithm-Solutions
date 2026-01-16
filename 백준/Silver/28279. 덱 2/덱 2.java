import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deck = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1: deck.addFirst(Integer.parseInt(st.nextToken()));
                        break;
                case 2: deck.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3: if(deck.isEmpty())sb.append(-1).append("\n");
                else sb.append(deck.pollFirst()).append("\n");
                    break;
                case 4: if(deck.isEmpty())sb.append(-1).append("\n");
                else sb.append(deck.pollLast()).append("\n");
                    break;
                case 5: sb.append(deck.size()).append("\n");
                    break;
                case 6: if(deck.isEmpty())sb.append(1).append("\n");
                else sb.append(0).append("\n");
                    break;
                case 7: if(deck.isEmpty())sb.append(-1).append("\n");
                else sb.append(deck.peekFirst()).append("\n");
                    break;
                case 8: if(deck.isEmpty())sb.append(-1).append("\n");
                else sb.append(deck.peekLast()).append("\n");
                    break;
            }


        }
        System.out.println(sb);

    }
}


