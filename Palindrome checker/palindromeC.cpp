#include <iostream>
#include <string>
using namespace std;

int main() {
    string x = "nitin";
    int y = x.length() / 2;
    bool isPalindrome = true;

    for (int i = 0; i < y; i++) {
        if (x[i] != x[x.length() - 1 - i]) {
            cout << "Your content is not a palindrome" << endl;
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        cout << "Your content is a palindrome" << endl;
    }

    return 0;
}
