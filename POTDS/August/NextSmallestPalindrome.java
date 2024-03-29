package August;

import java.util.Vector;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        int num[] = { 9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2 };
        int n = num.length;
        NextSmallestPalindrome ob = new NextSmallestPalindrome();
        Vector<Integer> res = ob.generateNextPalindrome(num, n);
        System.out.println(res);
    }

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        int i = (n - 1) / 2;
        int j = n / 2;
        boolean in = isnine(num);
        if (in) {
            Vector<Integer> v = new Vector<Integer>(n + 1);
            for (int k = 0; k < n + 1; k++) {
                if (k == 0 || k == n) {
                    v.add(1);
                } else {
                    v.add(0);
                }
            }
            return v;
        }
        boolean flag = is(num);

        while (i >= 0) {
            if (flag) {
                if (num[i] == 9) {
                    num[i] = 0;
                    flag = true;
                } else {
                    num[i]++;
                    flag = false;
                }
            }
            num[j++] = num[i--];
        }
        Vector<Integer> v = new Vector<Integer>(n);
        for (int k = 0; k < n; k++) {
            v.add(num[k]);
        }
        return v;
    }

    public boolean is(int[] num) {
        int n = num.length;
        int i = (n - 1) / 2;
        int j = (n) / 2;
        while (i >= 0) {
            if (num[i] < num[j]) {
                return true;
            } else if (num[i] > num[j]) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public boolean isnine(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 9) {
                return false;
            }
        }
        return true;
    }
}
