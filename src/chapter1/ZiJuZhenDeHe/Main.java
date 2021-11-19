package chapter1.ZiJuZhenDeHe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午2:20
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]), t = Integer.parseInt(strs[2]);
        int[][] sum = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            strs = reader.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                sum[i][j] = Integer.parseInt(strs[j - 1]);
                sum[i][j] += sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
        while (t-- > 0) {
            strs = reader.readLine().split(" ");
            int x1 = Integer.parseInt(strs[0]), y1 = Integer.parseInt(strs[1]), x2 = Integer.parseInt(strs[2]), y2 = Integer.parseInt(strs[3]);
            System.out.println(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1]);
        }
        reader.close();
    }
}
