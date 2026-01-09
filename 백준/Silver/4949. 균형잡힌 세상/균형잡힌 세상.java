import java.io.*;
import java.util.*;


class Main {
    public static String calculate(String ps) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ps.length(); i++) {
            switch (ps.charAt(i)) {
                case '(' : {
                    stack.push('(');
                    break;
                }
                case '[' : {
                    stack.push('[');
                    break;
                }
                case ')' : {
                    if(!stack.isEmpty()){
                        if (stack.peek() != '(') {
                            return "no";
                        } else stack.pop();
                    }else return "no";

                    break;
                }

                case ']' : {
                    if(!stack.isEmpty()){
                        if (stack.peek() != '[') {
                            return "no";
                        } else stack.pop();
                    }else return "no";
                    
                    break;
                }
            }
        }
        if (stack.isEmpty()) return "yes";
        else return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String ps = br.readLine();
            if (ps.equals(".")) break;
            sb.append(calculate(ps)).append("\n");
        }
        System.out.println(sb);
    }


}