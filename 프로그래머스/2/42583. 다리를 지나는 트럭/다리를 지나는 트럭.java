import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> standBy = new LinkedList<>(); //대기 트랙 큐
        Queue<Integer> bridge = new LinkedList<>(); //다리 큐
        int[] timeArr = new int[truck_weights.length]; //시간 적는 배열

        for(int i = 0; i < truck_weights.length; i++){
            standBy.add(i);
        } //인덱스로 넣기

        int time = 0;
        int nowWeight = 0;

        while(!bridge.isEmpty() || !standBy.isEmpty()){ //대기 트랙 큐, 다리 큐가 빌 때 까지
            time++;
            //일단 다 된 애들 차 빼
            if(!bridge.isEmpty()){
                if(timeArr[bridge.peek()] == time - bridge_length){
                    nowWeight -= truck_weights[bridge.poll()]; //다리 맨 끝에 잇는애가 나갈 트럭이 아닐 때 까지
                }
            }

            //이제 다음애들 들여보내
            if(!standBy.isEmpty()){
                if(nowWeight + truck_weights[standBy.peek()] <= weight) {
                    int now = standBy.poll();
                    bridge.add(now);
                    nowWeight += truck_weights[now]; //다리 현재 무게 갱신
                    timeArr[now] = time; //현재 시간 기록
                }
            }

        }


        return time;
    }
}