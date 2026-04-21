import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());//명령 갯수


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a!=0)stack.push(a);
            else stack.pop();
            }
        int size = stack.size();
        int result = 0;
        for(int i = 0; i < size; i++){
            result += stack.pop();
        }

        System.out.println(result);
        }
}





