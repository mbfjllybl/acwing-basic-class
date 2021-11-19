package chapter1.QianZhuiHe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午2:04
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), t = Integer.parseInt(strs[1]);
        strs = reader.readLine().split(" ");
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = Integer.parseInt(strs[i - 1]) + sum[i - 1];
        }
        while (t-- > 0) {
            strs = reader.readLine().split(" ");
            int l = Integer.parseInt(strs[0]), r = Integer.parseInt(strs[1]);
            System.out.println(sum[r] - sum[l - 1]);
        }
        reader.close();
    }
}
