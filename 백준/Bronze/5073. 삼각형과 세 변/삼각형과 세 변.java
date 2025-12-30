import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int max = Math.max(C, Math.max(A, B));
            if(A==0)break;


            if (A == B && B == C) System.out.println("Equilateral");
            else if ((max < A + B + C - max)&&(A == B || A == C || B == C)) System.out.println("Isosceles");
            else if (max < A + B + C - max) System.out.println("Scalene");
            else System.out.println("Invalid");

        }
    }
    }

