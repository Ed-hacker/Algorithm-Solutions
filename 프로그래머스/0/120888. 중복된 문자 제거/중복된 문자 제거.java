import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            char a = my_string.charAt(i);
            if(!set.contains(a)){
                sb.append(a);
                set.add(a);
            }

        }
        return sb.toString();
    }
}