package chapter1.QuJianHeBing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mbfjllybl
 * @version 1.0
 * @description: TODO
 * @date 2021/11/20 下午4:02
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<PII> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strs = reader.readLine().split(" ");
            int l = Integer.parseInt(strs[0]), r = Integer.parseInt(strs[1]);
            list.add(new PII(l, r));
        }
        Collections.sort(list, (o1, o2) ->  o1.getX() - o2.getX());
        int res = 0;
        for (int i = 0; i < n;) {
            int r = list.get(i).getY();
            int j = i + 1;
            res++;
            while (j < n && r >= list.get(j).getX()) {
                r = Math.max(r, list.get(j).getY());
                j++;
            }
            i = j;
        }
        System.out.println(res);
        reader.close();
    }
}

class PII {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PII() {
    }

    public PII(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
