#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int sub[N];
int n, t;

void insert(int l, int r, int x) {
    sub[l] += x;
    if (r + 1 <= n) sub[r + 1] -= x;
}

int main() {
    cin >> n >> t;
    for (int i = 1; i <= n; i++) {
        int x;
        cin >> x;
        insert(i, i, x);
    }
    while(t--) {
        int l, r, x;
        cin >> l >> r >> x;
        insert(l, r, x);
    }
    for (int i = 1; i <= n; i++) {
        sub[i] += sub[i - 1];
        cout << sub[i] << " ";
    }
    return 0;
}
