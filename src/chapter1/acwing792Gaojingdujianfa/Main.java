package chapter1.acwing792Gaojingdujianfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/19 上午1:13
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num1 = new BigInteger(reader.readLine());
        BigInteger num2 = new BigInteger(reader.readLine());
        BigInteger res = num1.subtract(num2);
        System.out.println(res);
        reader.close();
    }
}
