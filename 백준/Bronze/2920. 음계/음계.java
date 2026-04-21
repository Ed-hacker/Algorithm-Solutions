import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] music = new int[8];
        for(int i =0; i < 8; i++){
         music[i] = sc.nextInt();
        }
        if(music[0]== 1 &&music[1]== 2 &&music[2]==3 &&music[3]== 4&&music[4]==5 &&music[5]== 6&&music[6]== 7&&music[7]==8 ){
            System.out.println("ascending");
        } else if (music[7]== 1 &&music[6]== 2 &&music[5]==3 &&music[4]== 4&&music[3]==5 &&music[2]== 6&&music[1]== 7&&music[0]==8 ){
            System.out.println("descending");
        }else System.out.println("mixed");

    }
}

