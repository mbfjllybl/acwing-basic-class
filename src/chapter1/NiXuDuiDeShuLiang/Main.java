package chapter1.NiXuDuiDeShuLiang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 下午8:00
 */
public class Main {
    public static long res;
    public static int[] tmp, arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strs = reader.readLine().split(" ");
        arr = new int[n];
        tmp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        merageSort(0, n - 1);
        System.out.println(res);
    }

    public static void merageSort(int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        merageSort(l, mid);
        merageSort(mid + 1, r);
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                res += mid - i + 1;
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= r) tmp[k++] = arr[j++];
        for (int o = l; o <= r; o++) {
            arr[o] = tmp[o - l];
        }
    }
}
