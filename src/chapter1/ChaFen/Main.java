package chapter1.ChaFen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午2:38
 */
public class Main {
    public static int[] sub;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), t = Integer.parseInt(strs[1]);
        sub = new int[n + 1];
        strs = reader.readLine().split(" ");
        for (int i = 0; i < strs.length; i++) {
            int x = Integer.parseInt(strs[i]);
            insert(i + 1, i + 1, x);
        }
        while (t-- > 0) {
            strs = reader.readLine().split(" ");
            int l = Integer.parseInt(strs[0]), r = Integer.parseInt(strs[1]), x = Integer.parseInt(strs[2]);
            insert(l, r, x);
        }
        for (int i = 1; i <= n; i++) {
            sub[i] += sub[i - 1];
            System.out.print(sub[i] + " ");
        }
        reader.close();
    }

    public static void insert(int l, int r, int x) {
        sub[l] += x;
        if (r + 1 <= sub.length - 1) sub[r + 1] -= x;
    }
}
