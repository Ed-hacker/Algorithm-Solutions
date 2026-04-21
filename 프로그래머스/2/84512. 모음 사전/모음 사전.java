import java.util.ArrayList;
import java.util.List;

class Solution {
     private static final char[] CHARS = "AEIOU".toCharArray();
        
        private List<String> generate(String word){
            List<String> words = new ArrayList<>();
            words.add(word);
            
            if(word.length()==5)return words;
            //종료조건
            
            for(char c : CHARS){
                words.addAll(generate(word + c));
                //여기서 합쳐준다
            }
            
            return words;
        }
             
    public int solution(String word) {
       
        return generate("").indexOf(word);
    }
}