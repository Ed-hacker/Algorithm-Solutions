import java.io.IOException;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int N = br.nextInt();
        for(int i = 0; i < N; i++){
            int x = br.nextInt(); // 반복횟수
            String st = br.next();  //
            for(int j = 0; j < st.length(); j++){
                for(int k = 0; k < x; k++){
                    char A = st.charAt(j);
                    System.out.print(A);
                }
            }
            System.out.println("");
        }

        }

    }


