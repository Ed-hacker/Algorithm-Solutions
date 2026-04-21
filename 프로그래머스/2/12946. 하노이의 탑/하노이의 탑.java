import java.util.LinkedList;
class Solution {
    class Form{
        int from;
        int to;
        Form(int from, int to){
            this.from = from;
            this.to = to;
        }
    }
    
    
    private void hanoi(
        int start, int end, int number, LinkedList<Form> list){
        
        if(number == 1) {list.add(new Form(start,end));
                         return;};
        
        int mid = 6 - start - end;
        
        hanoi(start,mid,number-1,list);
        hanoi(start,end,1,list);
        hanoi(mid,end,number-1,list);
    }
    
    
    public int[][] solution(int n) {
        LinkedList<Form> list = new LinkedList<>();
        hanoi(1,3,n,list);
        
        
        int[][] answer = new int[list.size()][2];
        int i = 0;
        for(Form a : list){
            answer[i][0] = a.from;
            answer[i][1] = a.to;
            i++;
        }
        return answer;
    }
}