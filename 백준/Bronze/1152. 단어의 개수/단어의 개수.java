import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()){
            String st = sc.next();
            count++;
        }

        System.out.println(count);

}
}




