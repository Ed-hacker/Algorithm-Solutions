import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();

        Arrays.sort(chars);
        
        char[] reverse = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            reverse[i] = chars[chars.length-1-i];
        }
        return String.valueOf(reverse);
    }
}