import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;

        String st = String.valueOf(result);
        int[] arr = new int[st.length()];
        int[] number = new int[10];
        for(int i = 0; i < st.length(); i++){
            int a = st.charAt(i)- '0';
            for(int j = 0; j < 10; j++){
                if(a == j)number[j]++;
            }

        }

        for(int k = 0; k < 10; k++){
            System.out.println(number[k]);
        }





        }

    }



