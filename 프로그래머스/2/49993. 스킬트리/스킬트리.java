import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        Set<Character> set = new HashSet<>();
        Queue<Character> que = new LinkedList<>();

        for(int i = 0; i < skill.length(); i++){
            char now = skill.charAt(i);
            set.add(now);
            que.add(now);
        }

        int answer = 0;

        for(String str : skill_trees){
            boolean check = true;
            Queue<Character> nowque = new LinkedList<>(que); //큐 초기화
            for(int i = 0; i < str.length(); i++){
                if(set.contains(str.charAt(i))){
                    if(!nowque.isEmpty() && str.charAt(i) == nowque.peek()){
                        nowque.poll();
                    }else {
                        check = false;
                        break;
                    }
                }
            }
            if(check)answer++;
        }


        return answer;
    }
}