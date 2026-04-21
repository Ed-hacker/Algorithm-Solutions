#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    double A[N];
    double sum = 0;
    double max = 0;

    for(int i=0; i < N; i++){
    cin >> A[i];
    }

    for(int i = 0; i< N; i++){
        if(A[i]>max){
            max = A[i];
        }
        sum += A[i];
    }

    double exp = sum/N;

    cout <<(exp*100)/max << endl;

    return 0;

}
