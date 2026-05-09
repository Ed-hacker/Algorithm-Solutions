import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n = 0; n < commands.length; n++ ){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            
            int arrayLength = j - i + 1;
            int[] slashArray = new int [arrayLength];
            
            for(int l = i-1 , m = 0; m < arrayLength; l++, m++){
                slashArray[m] = array[l];
            }
            
            Arrays.sort(slashArray);
            
            answer[n] = slashArray[k-1];
        }
        return answer;
    }
}