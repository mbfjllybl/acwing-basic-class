#include <bits/stdc++.h>
using namespace std;
const int N = 100010;
int nums[N];

void quick_sort(int l, int r) {
    if (l >= r) return;
    int i = l - 1, j = r + 1, mid = nums[l + r >> 1];
    while (i < j) {
        do i++; while (nums[i] < mid);
        do j--; while (nums[j] > mid);
        if (i < j) swap(nums[i], nums[j]);
    }
    quick_sort(l, j), quick_sort(j + 1, r);
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) cin >> nums[i];
    quick_sort(0, n - 1);
    for (int i = 0; i < n; i++) cout << nums[i] << " ";
    return 0;
}