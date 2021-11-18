package chapter1.acwing786Kuaisupaixu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/18 下午11:46
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strs = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        reader.close();
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1, mid = arr[l + r >> 1];
        int n = arr.length;
        while (i < j) {
            do i++; while (arr[i] < mid);
            do j--; while (arr[j] > mid);
            if (i < j) swap(arr, i, j);
        }
        quickSort(arr, l, j);
        quickSort(arr, j + 1, r);
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }
}
