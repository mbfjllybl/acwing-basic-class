package chapter1.PanDuanZiXuLie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/20 下午2:37
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]);
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
        for (int i = 0, j = 0; j < m; j++) {
            if (numsA[i] == numsB[j]) i++;
            if (i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        reader.close();
    }
}

