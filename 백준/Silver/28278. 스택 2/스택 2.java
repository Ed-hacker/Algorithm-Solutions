import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());//명령 갯수


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch(a) {
                case 1: stack.push(Integer.parseInt(st.nextToken()));
                        break;
                case 2: sb.append(stack.empty() ? -1 : stack.pop()).append("\n");
                        break;
                case 3: sb.append(stack.size()).append("\n");
                        break;
                case 4: sb.append(stack.empty() ? 1 : 0 ).append("\n");
                        break;
                case 5: sb.append(stack.empty() ? -1 : stack.peek()).append("\n");
                        break;
            }
            }

        System.out.println(sb);



        }
}




