import java.util.Scanner;
class Main //26
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] contain = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        String st = sc.next();
        for(int i = 0; i < st.length(); i++){
            for(int j = 0; j < 26; j++){
                if(st.charAt(i) == 'a'+j&& contain[j] == -1){
                    contain[j] = i;
                }

            }
        }
        for(int k = 0; k < 26; k++)
        {if(contain[k] == -1) System.out.print(-1+" ");
            else System.out.print(contain[k]+" ");

        }


}
}




