#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int nums[N];

int main() {
    int n;
    cin >> n;
    int res = 0;
    unordered_map<int, int> u_map;
    for (int i = 0; i < n; i++) cin >> nums[i];
    for (int i = 0, j = 0; i < n; i++) {
        while (u_map.count(nums[i]) != 0 && u_map[nums[i]] != 0) {
            u_map[nums[j]]--;
            j++;
        }
        u_map[nums[i]]++;
        res = max(res, i - j + 1);
    }
    cout << res;
    return 0;
}