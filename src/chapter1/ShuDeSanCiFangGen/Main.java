package chapter1.ShuDeSanCiFangGen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午12:26
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double l = -100, r = 100;
        while (r - l > 1e-8) {
            double mid = (l + r) / 2;
            if (mid * mid * mid <= x) l = mid;
            else r = mid;
        }
        System.out.println(String.format("%.6f", l));
        reader.close();
    }
}

