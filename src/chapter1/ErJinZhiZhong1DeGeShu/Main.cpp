#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while (n--) {
        int x;
        cin >> x;
        int cnt = 0;
        while (x) {
            if (x & 1) cnt++;
            x >>= 1;
        }
        cout << cnt << " ";
    }
    return 0;
}