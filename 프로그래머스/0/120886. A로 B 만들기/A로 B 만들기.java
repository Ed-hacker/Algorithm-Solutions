import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String before, String after) {
        Map<Character,Integer> map = new HashMap<>();
        for(char a : before.toCharArray()){
            if(!map.containsKey(a)) map.put(a,1);
            else {
                map.put(a,map.get(a)+1);
            }
        }
        for(char b : after.toCharArray()){
            if(!map.containsKey(b)) return 0;
            else if(map.get(b) == 1){map.remove(b);}
            else{
                map.put(b,map.get(b)-1);
            }
        }
        
        if(map.isEmpty())return 1;
        else return 0;
    }
}