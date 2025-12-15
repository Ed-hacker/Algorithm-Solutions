import java.util.Scanner;


class Main {
    public static int dial(char a){
        if(a=='A'|| a=='B' || a== 'C')return 3;
        else if(a=='D'|| a=='E' || a== 'F')return 4;
        else if(a=='G'|| a=='H' || a== 'I')return 5;
        else if(a=='J'|| a=='K' || a== 'L')return 6;
        else if(a=='M'|| a=='N' || a== 'O')return 7;
        else if(a=='P'|| a=='Q' || a== 'S'|| a=='R')return 8;
        else if(a=='T'|| a=='U' || a== 'V')return 9;
        else return 10;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int time = 0;
        for(int i =0; i < st.length(); i++){
            time += dial(st.charAt(i));
        }
        System.out.println(time);
    }
}