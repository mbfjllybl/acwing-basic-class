#include <bits/stdc++.h>
using namespace std;
const int N = 1000010;
int nums[N];
int tmp[N];
int n;

void merge_sort(int l, int r) {
    if (l >= r) return;
    int mid = l + r >> 1;
    merge_sort(l, mid), merge_sort(mid + 1, r);
    int i = l, j = mid + 1, k = 0;
    while (i <= mid && j <= r) {
        if (nums[i] <= nums[j]) {
            tmp[k++] = nums[i++];
        } else tmp[k++] = nums[j++];
    }
    while (i <= mid) tmp[k++] = nums[i++];
    while (j <= r) tmp[k++] = nums[j++];
    for (int o = l; o <= r; o++) {
        nums[o] = tmp[o - l];
    }
}

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) cin >> nums[i];
    merge_sort(0, n - 1);
    for (int i = 0; i < n; i++) cout << nums[i] << " ";
    return 0;
}