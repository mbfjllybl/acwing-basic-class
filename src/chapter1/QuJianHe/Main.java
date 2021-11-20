package chapter1.QuJianHe;

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
 * @date 2021/11/20 下午3:16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]);
        List<PII> list1 = new ArrayList<>();
        List<PII> list2 = new ArrayList<>();
        List<Integer> alls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strs = reader.readLine().split(" ");
            int x = Integer.parseInt(strs[0]), y = Integer.parseInt(strs[1]);
            list1.add(new PII(x, y));
            alls.add(x);
        }
        for (int i = 0; i < m; i++) {
            strs = reader.readLine().split(" ");
            int x = Integer.parseInt(strs[0]), y = Integer.parseInt(strs[1]);
            list2.add(new PII(x, y));
            alls.add(x);
            alls.add(y);
        }
        Collections.sort(alls);
        int sz = unique(alls);
        alls = alls.subList(0, sz);
        int[] nums = new int[sz + 1];
        int[] sum = new int[sz + 1];
        for (int i = 0; i < n; i++) {
            nums[find(alls, list1.get(i).getX())] += list1.get(i).getY();
        }
        for (int i = 1; i <= sz; i++) sum[i] = sum[i - 1] + nums[i];
        for (int i = 0; i < m; i++) {
            int l = list2.get(i).getX(), r = list2.get(i).getY();
            System.out.println(sum[find(alls, r)] - sum[find(alls, l) - 1]);
        }
        reader.close();
    }

    public static int unique(List<Integer> alls) {
        int j = 0;
        for (int i = 0; i < alls.size(); i++) {
            if (i == 0 || alls.get(i) != alls.get(i - 1)) alls.set(j++, alls.get(i));
        }
        return j;
    }

    public static int find(List<Integer> alls, int x) {
        int l = 0, r = alls.size() - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (alls.get(mid) >= x) r = mid;
            else l = mid + 1;
        }
        return r + 1;
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

