package chapter1.ZuiChangLianXuBuChongFuZiXuLie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 下午8:18
 */
public class Main {
    public static int[] count = new int[100010];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strs = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            while (count[arr[i]] > 0) count[arr[j++]]--;
            count[arr[i]]++;
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);;
    }
}

