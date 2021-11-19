#include <bits/stdc++.h>
using namespace std;

vector<int> div(vector<int> A, int& x) {
    vector<int> res;
    int t = 0;
    for (int i = A.size() - 1; i >= 0; i--) {
        t *= 10;
        t += A[i];
        if (t < x) res.push_back(0);
        else {
            res.push_back(t / x);
            t %= x;
        }
    }
    x = t;
    reverse(res.begin(), res.end());
    while (res.size() > 1 && res[res.size() - 1] == 0) res.pop_back();
    return res;
}

int main() {
    string num1;
    int num2;
    cin >> num1 >> num2;
    vector<int> A, res;
    for (int i = num1.size() - 1; i >= 0; i--) A.push_back(num1[i] - '0');
    res = div(A, num2);
    for (int i = res.size() - 1; i >= 0; i--) cout << res[i];
    cout << endl << num2;
    return 0;
}