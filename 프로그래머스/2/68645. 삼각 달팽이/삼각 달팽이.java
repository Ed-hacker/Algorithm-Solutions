class Solution {
    static int[][] arr;
    static int row,column;  //몇번꺾지?
    static int number = 1;
    static void down(){
        while(row+1 != arr.length && arr[row+1][column] == 0 ){
            arr[++row][column] = ++number; //row는 올리고 대입,
         }
    }

    static void right(){
        while(column+1 != arr.length && arr[row][column+1] == 0 ){
            arr[row][++column] = ++number; //row는 올리고 대입,
        }
    }

    static void diagonal(){
        while(arr[row-1][column-1] == 0){
            arr[--row][--column] = ++number; //row는 올리고 대입,
        }
    }



    public int[] solution(int n) {
        arr = new int[n][n];
        arr[0][0] = 1;
        row = 0;
        column = 0;
        number = 1;
        while(true){
            down();
            if(number == arr.length*(arr.length+1)/2) break;
            right();
            if(number == arr.length*(arr.length+1)/2) break;
            diagonal();
            if(number == arr.length*(arr.length+1)/2) break;
        }


        int[] answer = new int[n*(n+1)/2];
        int count = 0;
        for(int[] i : arr){
            for(int j : i){
                if(j != 0) answer[count++] = j;
            }
        }
        return answer;
    }
}