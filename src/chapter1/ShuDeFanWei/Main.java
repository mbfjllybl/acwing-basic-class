package chapter1.ShuDeFanWei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午12:14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, t;
        String[] strs = reader.readLine().split(" ");
        n = Integer.parseInt(strs[0]);
        t = Integer.parseInt(strs[1]);
        strs = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        while (t-- > 0) {
            int x = Integer.parseInt(reader.readLine());
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (arr[mid] >= x) r = mid;
                else l = mid + 1;
            }
            if (arr[l] != x) {
                System.out.println("-1 -1");
                continue;
            } else {
                System.out.print(l + " ");
                l = 0;
                r = n - 1;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (arr[mid] <= x) l = mid;
                    else r = mid - 1;
                }
                System.out.println(l);
            }
        }
        reader.close();
    }
}

