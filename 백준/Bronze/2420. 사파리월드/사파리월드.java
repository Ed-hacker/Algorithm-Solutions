import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long result = N - M;
        if(result>=0) System.out.println(result);
        else System.out.println(-result);

        }
    }
