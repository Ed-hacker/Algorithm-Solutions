class Solution {
    static int posi;
    static int video_leni;
    static int op_endi;
    static int op_starti;
    
    public static int StrToInt(String a){
        return (a.charAt(0) - '0') * 600 + 
           (a.charAt(1) - '0') * 60 +  
           (a.charAt(3) - '0') * 10 +  
           (a.charAt(4) - '0');}
    
    public static void prev(){
        if(posi < 10){
            posi = 0;
        }
        else posi -= 10;    
    }
    
    public static void next(){
        if(posi+10 > video_leni)posi = video_leni;
        else posi += 10;
    }
    
    public static void op_pass(){
        if(posi >= op_starti && posi <= op_endi)posi = op_endi;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        video_leni  = StrToInt(video_len);
        posi = StrToInt(pos);
        op_starti = StrToInt(op_start);
        op_endi = StrToInt(op_end);
        
        for(int i = 0; i < commands.length; i++){
            op_pass();
            if(commands[i].charAt(0) == 'p'){prev();
                                            op_pass();}
            else if(commands[i].charAt(0) == 'n'){next();
                                                 op_pass();}
            
        }
        StringBuilder sb = new StringBuilder();
        if(posi/60 >= 10){
            sb.append(posi/60).append(":");
        }else sb.append(0).append(posi/60).append(":");
            
        if(posi % 60 >= 10)sb.append(posi%60);
        else sb.append(0).append(posi%60);
        
    
        return sb.toString();
    }
}