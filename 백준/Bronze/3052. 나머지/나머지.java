import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] mod = new boolean [42];
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            int b =  a % 42;
            mod[b] = true;
        }
        int count = 0;
        for(int j = 0; j < 42; j++){
            if(mod[j]){ count++;
        }
    }
        System.out.println(count);
}
}




