import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int sum = A+B+C;
            int max = Math.max(C, Math.max(A, B));


            if (A == B && B == C) System.out.println(sum); //정삼각형
            else if ((max < A + B + C - max)&&(A == B || A == C || B == C)) System.out.println(sum);
            else if (max < A + B + C - max) System.out.println(sum);
            else {max = A+B+C -max-1;
             System.out.println(Math.min(A,max)+Math.min(B,max)+Math.min(C,max));} //오버됫을때

        }

    }

