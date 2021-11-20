#include <bits/stdc++.h>
using namespace std;
#define x first
#define y second
const int N = 300010;

pair<int, int> A[N], B[N];
int sum[N], a[N];
vector<int> v;

int find(int x) {
    return lower_bound(v.begin(), v.end(), x) - v.begin() + 1;
}

int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> A[i].x >> A[i].y;
        v.push_back(A[i].x);
    }
    for (int i = 0; i < m; i++) {
        cin >> B[i].x >> B[i].y;
        v.push_back(B[i].x);
        v.push_back(B[i].y);
    }
    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());
    for (int i = 0; i < n; i++) {
        int tmp = find(A[i].x);
        a[tmp] += A[i].y;
    }
    for (int i = 1; i <= v.size(); i++) sum[i] = sum[i - 1] + a[i];
    for (int i = 0; i < m; i++) {
        int l = find(B[i].x), r = find(B[i].y);
        cout << sum[r] - sum[l - 1] << endl;
    }
    return 0;
}