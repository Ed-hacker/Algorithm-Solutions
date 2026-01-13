import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //사람 수

        Stack<Integer> stack = new Stack<>();
        int now = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken()); //다음 숫자              스택이 차있고 스택 맨위가 a랑 같이 않을

                if(now == a){
                    now++;
                }else {stack.push(a);}

            while(!stack.isEmpty() && now == stack.peek())
            { stack.pop();
                now++;
            }





            //다 넣어!
        }


        if(stack.isEmpty()){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
            
        }





    }
}