import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> speedQue = new LinkedList<>();
        Queue<Integer> progressQue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
        for(int a : speeds ){
            speedQue.add(a);
        } //que에 다 넣는다
        for(int b : progresses){
            progressQue.add(b);
        }
        int day = 0;//날짜
        while(!speedQue.isEmpty()){
            day++; //1
            int cnt = 0;
            while(true){
                if(100 <= progressQue.peek()+day*speedQue.peek()){
                    speedQue.poll();
                    progressQue.poll();
                    cnt++;
                    if(speedQue.isEmpty()){
                        result.add(cnt);
                        break;
                    }
                }else{
                    if(cnt != 0) result.add(cnt);
                    break;
                }
            }
        }


        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.poll();
        }
        return answer;
    }
}