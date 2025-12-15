import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String reversedA = new StringBuilder(st).reverse().toString();
        if(st.equals(reversedA)) System.out.println(1);
        else System.out.println(0);
    }
}