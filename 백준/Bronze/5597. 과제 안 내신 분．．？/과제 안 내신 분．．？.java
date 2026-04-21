import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] homework = new boolean[31];
        for(int i =0; i < 28; i++){
            int a = sc.nextInt();
            homework[a] = true;
        }

        for(int j =1; j <= 30; j++){

           if(!homework[j])
               System.out.println(j);

        }




    }

}




