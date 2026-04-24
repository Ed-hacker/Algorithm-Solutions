import java.util.*;

class Solution {
    final static int[] arr1 = {1,2,3,4,5};
    final static int[] arr2 = {2,1,2,3,2,4,2,5};
    final static int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
    
    public void calculate(int[] cnt,int[] answers){
        for(int i = 0; i < answers.length; i++){
            if(arr1[i%arr1.length] == answers[i])cnt[0]++;
            
            if(arr2[i%arr2.length] == answers[i])cnt[1]++;
            
            if(arr3[i%arr3.length] == answers[i])cnt[2]++;
        }
        
        return;
    }
    
    
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
         
        calculate(cnt, answers);
        
        int max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        
        
        List<Integer> list = new ArrayList<>();
        
        int cnts = 0;
        for(int i = 0; i < 3; i++){
            if(max == cnt[i]){list.add(i+1);
              cnts++;               }
        }
        
        int[] answer = new int[cnts];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        

        
        return answer;
    }
}