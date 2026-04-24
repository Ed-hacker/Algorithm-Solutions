class Solution {
    public int[] solution(int brown, int yellow) {
        int plus = (brown+4)/2;
        int multi = brown + yellow;
        int x = 0;
        for(int i = 1; i < brown; i++){
            if(i*(plus-i) == multi){
                x = i;
                break;
            }
        }
        
        
        
        int[] answer = {Math.max(x,plus-x),Math.min(x,plus-x)};
        return answer;
    }
}