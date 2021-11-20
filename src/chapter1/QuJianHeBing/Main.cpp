#include <bits/stdc++.h>
using namespace std;
vector<pair<int, int>> v;
#define x first
#define y second

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        v.push_back({a, b});
    }
    sort(v.begin(), v.end());
    int cnt = 0;
    for (int i = 0; i < n;) {
        cnt++;
        int j = i + 1;
        int r = v[i].y;
        while (j < v.size() && r >= v[j].x) r = max(r, v[j].y), j++;
        i = j;
    }
    cout << cnt;
    return 0;
}