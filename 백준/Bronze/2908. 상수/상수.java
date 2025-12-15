import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        if(A.charAt(2)>B.charAt(2)){
            System.out.print(""+A.charAt(2)+A.charAt(1)+A.charAt(0));
        }else if (A.charAt(2)<B.charAt(2)){
            System.out.print(""+B.charAt(2)+B.charAt(1)+B.charAt(0));
        }else {
            if (A.charAt(1) > B.charAt(1)) {
                System.out.print(""+A.charAt(2) + A.charAt(1) + A.charAt(0));
            } else if (A.charAt(1) < B.charAt(1)) {
                System.out.print(""+B.charAt(2) + B.charAt(1) + B.charAt(0));
            } else {
                if (A.charAt(0) > B.charAt(0)) {
                    System.out.print(""+A.charAt(2) + A.charAt(1) + A.charAt(0));
                } else if (A.charAt(0) < B.charAt(0)) {
                    System.out.print(""+B.charAt(2) + B.charAt(1) + B.charAt(0));

                }


            }


        }
    }
}




