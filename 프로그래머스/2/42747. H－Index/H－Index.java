public class Solution{
    public int solution(int[] citations){
        int h = 0;
        int answer = 0;

        
        while(h <= citations.length){
            int count = 0;
            
            for(int i = 0; i < citations.length; i++){
                if( h <= citations[i]) count++;
            }
            
            if(h <= count){
                answer = h;  //count가 h보다 크면 h-index 업데이트
            }else{
                break;  // 조건 만족못하면 어차피 h가 더 커져도 무조건 만족 못하므로 break
            }
            h++;
        }

        return answer;


}
}