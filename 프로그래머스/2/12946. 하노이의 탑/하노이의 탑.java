import java.util.*; 
class Solution {    
    private void hanoi(
        int start, int end, int number, ArrayList<int[]> list){
        if(number == 1) {list.add(new int[] {start,end});
                         return;}
        
        int mid = 6 - start - end;
        
        hanoi(start,mid,number-1,list);
        hanoi(start,end,1,list);
        hanoi(mid,end,number-1,list);
    }
    
    
    public int[][] solution(int n) {
        ArrayList<int[]> list = new ArrayList<>();
        hanoi(1,3,n,list);
        
        return list.toArray(new int[0][]);
    }
}