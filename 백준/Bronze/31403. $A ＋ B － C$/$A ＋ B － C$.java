import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A+B-C);
        String a = Integer.toString(A);
        String b = Integer.toString(B);
        int c = parseInt(a + b);
        System.out.println(c-C);





    }
}



