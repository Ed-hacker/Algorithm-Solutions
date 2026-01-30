class Solution {
    public int[] solution(String s) {
        int countZero = 0;
        int count = 0;
        
        while(s.length() != 1){//길이 1되면 그만
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0')countZero++;
                else sb.append(1);
            } //0없애기
            
            int number = sb.toString().length();
            StringBuilder sb2 = new StringBuilder();
            while(number != 0){
                sb2.append(number%2);
                number /= 2;
            }
            
            s = sb2.toString();
            count++;
            
        }
        
        int[] answer = {count, countZero};
        return answer;
    }
}