package chapter1.ErJinZhiZhong1DeGeShu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/20 下午2:51
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strs = reader.readLine().split(" ");
        for (int i = 0; i < strs.length; i++) {
            int x = Integer.parseInt(strs[i]);
            int cnt = 0;
            while (x != 0) {
                if ((x & 1) == 1) cnt++;
                x >>= 1;
            }
            System.out.print(cnt + " ");
        }
        reader.close();
    }
}
