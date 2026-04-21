#include <iostream>
using namespace std;

int main() {

    int N = 0;
    string Number;

    cin >> N;
    cin >> Number;

    int sum = 0;

    for(int i = 0; i < Number.length(); i++){
        sum += Number[i] - '0';
    }

    cout << sum << "\n" ;

}
