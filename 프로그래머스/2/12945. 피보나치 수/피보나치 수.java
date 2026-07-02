class Solution {
    public int dp(int[] arr, int t){
        if(arr[t] == 0 && t > 1){
        return arr[t] = (dp(arr,t-1) + dp(arr,t-2)) % 1234567;
        }
        else return arr[t];
    }
    
    public int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        return dp(arr,n);
 
    }
}