#include <bits/stdc++.h>
using namespace std;

vector<int> mul(vector<int> A, vector<int> B) {
    vector<int> res(A.size() + B.size() + 1, 0);
    for (int i = 0; i < A.size(); i++) {
        for (int j = 0; j < B.size(); j++)
            res[i + j] += A[i] * B[j];
    }
    int t = 0;
    for(int i = 0; i < res.size() || t; i++) {
        res[i] += t;
        t = res[i] / 10;
        res[i] %= 10;
    }
    while (res.size() > 1 && res[res.size() - 1] == 0) res.pop_back();
    return res;
}

int main() {
    string num1, num2;
    cin >> num1 >> num2;
    vector<int> A, B, res;
    for (int i = num1.size() - 1; i >= 0; i--) A.push_back(num1[i] - '0');
    for (int i = num2.size() - 1; i >= 0; i--) B.push_back(num2[i] - '0');
    res = mul(A, B);
    for (int i = res.size() - 1; i >= 0; i--) cout << res[i];
    return 0;
}