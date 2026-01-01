import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A == 0&&B==0&&C==0)break;

            int max = Math.max(C,Math.max(A,B));
            if(A*A+B*B+C*C==max*max*2) System.out.println("right");
            else System.out.println("wrong");




            }
    }
        }



