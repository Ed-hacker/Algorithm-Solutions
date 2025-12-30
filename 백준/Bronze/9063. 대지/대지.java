import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int xmax = -10000;
        int xmin = 10000;
        int ymax = -10000;
        int ymin = 10000;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            xmin = Math.min(xmin,x);
            xmax = Math.max(xmax,x);

            int y = sc.nextInt();
            ymin = Math.min(ymin,y);
            ymax = Math.max(ymax,y);
        }

        if(N==1) System.out.println(0);
        else System.out.println((xmax-xmin)*(ymax-ymin));

    }

    }
