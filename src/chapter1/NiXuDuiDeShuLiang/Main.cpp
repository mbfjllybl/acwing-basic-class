#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int tmp[N], nums[N];
long long res;

void count(int l, int r) {
    if (l >= r) return;
    int mid = l + r >> 1;
    count(l, mid), count(mid + 1, r);
    int i = l, j = mid + 1, k = 0;
    while (i <= mid && j <= r) {
        if (nums[i] <= nums[j]) {
            tmp[k++] = nums[i++];
        } else {
            res += (mid - i + 1);
            tmp[k++] = nums[j++];
        }
    }
    while (i <= mid) tmp[k++] = nums[i++];
    while (j <= r) tmp[k++] = nums[j++];
    for (int o = l; o <= r; o++) nums[o] = tmp[o - l];
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> nums[i];
    count(0, n - 1);
    cout << res;
    return 0;
}