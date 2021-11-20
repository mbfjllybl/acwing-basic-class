package chapter1.DiKGeShu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 下午7:27
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), k = Integer.parseInt(strs[1]);
        strs = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(topK(arr, 0, n - 1, k));
        reader.close();
    }

    public static int topK(int[] arr, int l, int r, int k) {
        if (l >= r) return arr[l];
        int i = l - 1, j = r + 1, mid = arr[l + r >> 1];
        while (i < j) {
            do i++; while (arr[i] < mid);
            do j--; while (arr[j] > mid);
            if (i < j) {
                swap(arr, i, j);
            }
        }
        if (k <= j - l + 1) return topK(arr, l, j, k);
        else return topK(arr, j + 1, r, k - (j - l + 1));
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

