import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ax = sc.nextInt();
        int Ay = sc.nextInt();
        int Bx = sc.nextInt();
        int By = sc.nextInt();
        int Cx = sc.nextInt();
        int Cy = sc.nextInt();
        int x = 0;
        int y = 0;

        if(Ax==Bx)x=Cx;
        else if(Ax == Cx)x = Bx;
        else x = Ax;

        if(Ay==By)y=Cy;
        else if(Ay == Cy)y = By;
        else y = Ay;

        System.out.println(x+" "+y);

    }

    }
