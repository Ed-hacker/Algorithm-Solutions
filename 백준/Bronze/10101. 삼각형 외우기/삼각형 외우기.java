import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A+B+C;

        if(A==60&&B==60&&C==60) System.out.println("Equilateral");
        else if(sum==180 && (A==B||A==C||B==C)) System.out.println("Isosceles");
        else if (sum == 180) System.out.println("Scalene");
        else System.out.println("Error");

        }

    }

    