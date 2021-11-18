package chapter1.acwing794Gaojingduchufa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午1:43
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num1 = new BigInteger(reader.readLine());
        BigInteger num2 = new BigInteger(reader.readLine());
        BigInteger[] res = num1.divideAndRemainder(num2);
        System.out.println(res[0]);
        System.out.println(res[1]);
        reader.close();
    }
}
