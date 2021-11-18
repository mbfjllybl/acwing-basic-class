#include <bits/stdc++.h>
using namespace std;

bool compare(vector<int> A, vector<int> B) {
    if (A.size() != B.size()) return A.size() > B.size();
    for (int i = A.size() - 1; i >= 0; i--) {
        if (A[i] != B[i]) return A[i] > B[i];
    }
    return true;
}

vector<int> sub(vector<int> A, vector<int> B) {
    vector<int> res;
    int t = 0;
    for (int i = 0; i < A.size(); i++) {
        t += A[i];
        if (i < B.size()) t -= B[i];
        if (t < 0) {
            res.push_back(t + 10);
            t = -1;
        } else {
            res.push_back(t);
            t = 0;
        }
    }
    while (res.size() > 1 && res[res.size() - 1] == 0) res.pop_back();
    return res;
}

int main() {
    string num1, num2;
    cin >> num1 >> num2;
    vector<int> A, B;
    for (int i = num1.size() - 1; i >= 0; i--) A.push_back(num1[i] - '0');
    for (int i = num2.size() - 1; i >= 0; i--) B.push_back(num2[i] - '0');
    vector<int> res;
    if (compare(A, B)) {
        res = sub(A, B);
    } else {
        res = sub(B, A);
        cout << "-";
    }
    for (int i = res.size() - 1; i >= 0; i--) {
        cout << res[i];
    }
    return 0;
}