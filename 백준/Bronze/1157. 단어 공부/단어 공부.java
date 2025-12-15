import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        int[] count = new int[58];//65더하면 아스키쓰
        int[] alpabet = new int[27]; //알파벳 0번이 A

        for(int i =0; i< st.length(); i++){
            for(int j = 0; j<58;j++){
                if(st.charAt(i) == (char)(j+65)){
                    count[j]++;
                }
            }
        }

        for(int j = 0; j < 26; j++){
            alpabet[j]= count[j] + count[j+32];
        }

        boolean x = false; //true면 겹침
        int max = 26; //최대인 인덱스
        alpabet[26] = -1;

        for(int k = 0; k < 26; k++){
            if(alpabet[max] < alpabet[k]){ //k번째가 더 크면 max갱신하고 중복 취소
                max = k;
                x = false;
            }else if(alpabet[max]==alpabet[k]){ //같으면 중복 체크
                if(!x)x=true;
            }
        }

        if(x)System.out.println("?");
        else System.out.println((char) (max+65));










    }
}