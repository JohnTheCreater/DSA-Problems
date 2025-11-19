package test;

import java.util.*;

public class T1 {
    public static long getMinTime(int[] s, int[] e, long m) {
        int n = s.length;
        TreeMap<Long, Long> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put((long) s[i], map.getOrDefault((long) s[i], 0L) + 1);
            map.put((long) e[i] + 1, map.getOrDefault((long) e[i] + 1, 0L) - 1);
        }

        long cur = 0, prev = 0, tot = 0;

        for (long t : map.keySet()) {
            if (prev != 0) {
                long d = t - prev;
                long add = cur * d;
                if (tot + add >= m) {
                    long need = m - tot;
                    long sec = (need + cur - 1) / cur;
                    return prev + sec - 1;
                }
                tot += add;
            }
            cur += map.get(t);
            prev = t;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] s = {1,4};
        int[]e = {3,4};
        int m = 10;
        System.out.println(getMinTime(s,e,m));
    }
}

