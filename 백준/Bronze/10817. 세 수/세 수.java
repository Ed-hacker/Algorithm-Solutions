import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        int max = Math.max(Math.max(A,B),C); //최대
        int min = Math.min(Math.min(A,B),C); //최소

        System.out.println(A+B+C-max-min);

            }
    }


