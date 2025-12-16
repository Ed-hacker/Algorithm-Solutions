import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int count = 0;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i)=='c'&& i < st.length()-1){
                if(st.charAt(i+1) == '='||st.charAt(i+1) == '-')count++;
            } // c= , c- 1개 처리/ 나중에 뺴주면 됨


            if(st.charAt(i)=='d'&& i < st.length()-2){
                if(st.charAt(i+1) == 'z'&& st.charAt(i+2) == '=')count += 1;
            } //dz= 처리

            if(st.charAt(i)=='d'&& i < st.length()-1){
                if(st.charAt(i+1) == '-')count++;
            } //d- 처리

            if(st.charAt(i)=='z'&& i < st.length()-1){
                if(st.charAt(i+1) == '=')count++;
            } //d- 처리

            if(st.charAt(i)=='l'&& i < st.length()-1){
                if(st.charAt(i+1) == 'j')count++;
            } // lj 처리

            if(st.charAt(i)=='n'&& i < st.length()-1){
                if(st.charAt(i+1) == 'j')count++;
            } // nj 처리

            if(st.charAt(i)=='s'&& i < st.length()-1){
                if(st.charAt(i+1) == '=')count++;
            } // s= 처리

        }

        System.out.println(st.length()-count);




    }
}