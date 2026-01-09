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
            if(a==1){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(a==2){
                if(stack.empty())sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
            }
            else if(a==3)sb.append(stack.size()).append("\n");
            else if(a==4){if(stack.empty())sb.append(1).append("\n");
                    else sb.append(0).append("\n");
            }
            else if(a==5) {if(stack.empty())sb.append(-1).append("\n");
            else sb.append(stack.peek()).append("\n");
        }}



        System.out.println(sb);



        }
}



