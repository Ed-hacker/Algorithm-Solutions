import java.util.Stack;

class Solution {
    public int check(char[] arr, int k){ //k만큼 회전
        Stack<Character> stack = new Stack<>(); //()는 0 []는 1 {}는 2
        for(int i = k; i < arr.length+k; i++){ //1~6
            int n = i;
            if(i >= arr.length){n = i - arr.length;}
            char c = arr[n];
            if( c == '(') stack.add('(');
            else if( c == ')'){
                if( !stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return 0;
            }else if( c == '[') stack.add('[');
            else if( c == ']'){
                if( !stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return 0;
            }else if( c == '{') stack.add('{');
            else if( c == '}'){
                if( !stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return 0;
            }
        }
        if(stack.isEmpty()) return 1;
        else return 0;
    }

    public int solution(String s) {
        char[] arr = s.toCharArray();
        int answer = 0;
        for(int k = 0; k < arr.length; k++ ){
            answer += check(arr,k);
        }
        return answer;
    }
}