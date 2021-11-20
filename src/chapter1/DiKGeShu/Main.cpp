#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int nums[N];

int top_k(int l, int r, int k) {
    if (l >= r) return nums[l];
    int i = l - 1, j = r + 1, mid = nums[l + r >> 1];
    while (i < j) {
        do i++; while (nums[i] < mid);
        do j--; while (nums[j] > mid);
        if (i < j) swap(nums[i], nums[j]);
    }
    if (j - l + 1 >= k) return top_k(l, j, k);
    else return top_k(j + 1, r, k - (j - l + 1));
}

int main() {
    int n, k;
    cin >> n >> k;
    for (int i = 0; i < n; i++) cin >> nums[i];
    cout << top_k(0, n - 1, k);
    return 0;
}