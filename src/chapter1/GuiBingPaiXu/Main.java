package chapter1.GuiBingPaiXu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午12:02
 */
public class Main {
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        tmp = new int[n];
        String[] strs = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < strs.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reader.close();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
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
