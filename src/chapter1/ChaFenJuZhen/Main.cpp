#include <bits/stdc++.h>
using namespace std;
const int N = 1010;
int sub[N][N];

void insert(int x1, int y1, int x2, int y2, int xsub[i][j] += sub[i - 1][j] + sub[i][j - 1] - sub[i - 1][j - 1];) {
    sub[x1][y1] += x;
    sub[x1][y2 + 1] -= x;
    sub[x2 + 1][y1] -= x;
    sub[x2 + 1][y2 + 1] += x;
}

int main() {
    int n, m, t;
    cin >> n >> m >> t;
    for (int i = 1; i <= n; i++)
        for (int j = 1; j <= m; j++) {
            int x;
            cin >> x;
            insert(i, j, i, j, x);
        }
    while (t--) {
        int x1, y1, x2, y2, x;
        cin >> x1 >> y1 >> x2 >> y2 >> x;
        insert(x1, y1, x2, y2, x);
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            sub[i][j] += sub[i - 1][j] + sub[i][j - 1] - sub[i - 1][j - 1];
            cout << sub[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}