#include <stdio.h>

int main(){
    int input[8];
    int max = 0;
    int num = 0;
    for (int i = 0; i < 9; i++){
        scanf("%d", &input[i]);
    }
    for(int k = 0; k <9 ; k++){
        if( input[k] > max){
            max = input[k];
            num = k;
        }
    }
printf("%d\n%d",max, num+1 );
    return 0;

}
