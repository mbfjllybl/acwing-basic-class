package chapter1.ShuZuYuanSuDeMuBiaoHe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/20 下午2:17
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]), x = Integer.parseInt(strs[2]);
        int[] numsA = new int[n];
        int[] numsB = new int[m];
        strs = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numsA[i] = Integer.parseInt(strs[i]);
        }
        strs = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            numsB[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j > 0 && numsA[i] + numsB[j] > x) j--;
            if (numsA[i] + numsB[j] == x) {
                System.out.println(i + " " + j);
            }
        }
        reader.close();
    }
}

