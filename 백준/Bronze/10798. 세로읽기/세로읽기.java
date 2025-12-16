import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr= new String[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.next();
        }//단어 다 넣음

        for(int j = 0; j < 15; j++){ //처음엔 j번째에 있는 것들 나열 3번째라고 해보자 좌표j로는 2
            for(int k = 0; k < 5; k++){
                if(arr[k].length() >= j+1) {System.out.print(arr[k].charAt(j));}
            }
        }

    }
}