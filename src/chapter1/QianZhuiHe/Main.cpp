#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int sum[N];

int main() {
    int n, t;
    cin >> n >> t;
    for (int i = 1; i <= n; i++) {
        cin >> sum[i];
        sum[i] += sum[i -1];
    }
    while (t--) {
        int l, r;
        cin >> l >> r;
        cout << sum[r] - sum[l - 1] << endl;
    }
    return 0;
}