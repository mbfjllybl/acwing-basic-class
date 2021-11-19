package chapter1.ChaFenJuZhen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午3:08
 */
public class Main {
    public static int[][] sub;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]), t = Integer.parseInt(strs[2]);
        sub = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            strs = reader.readLine().split(" ");
            for (int j = 0; j < strs.length; j++) {
                insert(i, j + 1, i, j + 1, Integer.parseInt(strs[j]));
            }
        }
        while (t-- > 0) {
            strs = reader.readLine().split(" ");
            int x1 = Integer.parseInt(strs[0]), y1 = Integer.parseInt(strs[1]), x2 = Integer.parseInt(strs[2]), y2 = Integer.parseInt(strs[3]), x = Integer.parseInt(strs[4]);
            insert(x1, y1, x2, y2, x);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sub[i][j] += sub[i - 1][j] + sub[i][j - 1] - sub[i - 1][j - 1];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void insert(int x1, int y1, int x2, int y2, int x) {
        sub[x1][y1] += x;
        if (x2 + 1 < sub.length) sub[x2 + 1][y1] -= x;
        if (y2 + 1 < sub[0].length) sub[x1][y2 + 1] -= x;
        if (x2 + 1 < sub.length && y2 + 1 < sub[0].length)sub[x2 + 1][y2 + 1] += x;
    }
}

