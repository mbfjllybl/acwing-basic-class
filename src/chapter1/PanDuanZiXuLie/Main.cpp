#include <bits/stdc++.h>
using namespace std;
const int N = 100010;
int a[N], b[N];

int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) cin >> a[i];
    for (int i = 0; i < m; i++) cin >> b[i];
    for (int i = 0, j = 0; j < m; j++) {
        if (a[i] == b[j]) i++;
        if (i == n) {
            cout << "Yes";
            return 0;
        }
    }
    cout << "No";
    return 0;
}