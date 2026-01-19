import java.io.*;
import java.util.*;


class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        String answer = min+" "+max;
        return answer;
    }
}