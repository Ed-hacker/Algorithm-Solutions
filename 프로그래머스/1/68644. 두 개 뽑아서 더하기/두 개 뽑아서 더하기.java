import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> IntSet = new HashSet<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                IntSet.add(numbers[i] + numbers[j]);
            }
        }
        
        
        int[] answer = new int[IntSet.size()];
        int index = 0;
        for(int a : IntSet){
            answer[index++] = a;
        }
        Arrays.sort(answer);
        return answer;
    }
}