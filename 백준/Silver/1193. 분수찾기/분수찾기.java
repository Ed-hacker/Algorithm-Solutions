import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while(N > 0){
            N -= row;
            if(N<=0)break;
            row++;
        }

        if((row%2) == 0){
            System.out.println((row+N)+"/" + (1-N));
        }else{
            System.out.println( (1-N)  +  "/" + (N+row));


        }



        }
    }
