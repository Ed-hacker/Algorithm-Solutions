import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            answer[i] = prices.length-1-i;
        }
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int x = 1; x < prices.length; x++){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && prices[x] < prices[stack.peek()]){
                    int n = stack.pop();
                    answer[n] = answer[n] - answer[x];
                }
                stack.push(x);
            }
        }
        
        return answer;
    }
}