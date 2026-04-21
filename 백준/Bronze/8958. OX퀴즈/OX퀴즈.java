import java.util.Scanner;

class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i =0; i < N; i++ ){//N번 반복
            String st = sc.next();
            int count = 0;
            int result = 0;
            for(int j = 0; j < st.length(); j++){
                char A = st.charAt(j);
                if( A == 'O'){
                    count = count +1;
                    result += count;
                }
                else{
                    count = 0;
                }

            }

            System.out.println(result);

        }


    }


}


