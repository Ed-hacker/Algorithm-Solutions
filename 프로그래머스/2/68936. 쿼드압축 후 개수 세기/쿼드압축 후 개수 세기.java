class Solution {
    static int cntZero = 0;
    static int cntOne = 0;
    
    private static boolean checkBox(
        int row, int column, int size, int[][] arr){
        int start = arr[row][column];
        for(int i = row; i < row + size; i++){
            for(int j = column; j < column + size; j++){
                if(start != arr[i][j])return false;
            }
        }
        
        if(start == 1)cntOne++;
        else cntZero++;
        
        return true;
    }    
    private static void box(int row, int column, int size, int[][] arr){
        if(checkBox(row,column,size,arr))return;
        
        box(row,column,size/2,arr);
        box(row+size/2 , column, size/2, arr);
        box(row, column+ size/2, size/2, arr);
        box(row+size/2, column+ size/2, size/2, arr);
    }
    
    public int[] solution(int[][] arr) {
        box(0,0,arr.length,arr);
        int[] answer = {cntZero, cntOne};
        return answer;
    }
}