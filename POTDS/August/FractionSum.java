package August;

import java.util.*;

public class FractionSum {
    public static void main(String[] args) {
        int num[] = { 1, 2, 1, 4, 3 };
        int den[] = { 2, 4, 5, 5, 6 };
        int n = num.length;
        int res = countFractions(n, num, den);
        System.out.println(res); // Result : 4
    }

    public static int countFractions(int n, int[] num, int[] den) {
        ArrayList<Double> arr = new ArrayList<>();
        ;
        for (int i = 0; i < n; i++) {
            int j = num[i];
            int k = den[i];
            arr.add(j * 1.0 / k);
        }
        Collections.sort(arr);
        int j = 0;
        int k = n - 1;
        int res = 0;
        while (j < k) {
            double n1 = arr.get(j);
            double n2 = arr.get(k);
            double sum = n1 + n2;
            if (sum > 1.0) {
                k--;
            } else if (sum < 1.0) {
                j++;
            } else {
                res++;
                j++;

                int t = 1;
                if (n1 == 0.5) {
                    t = k - j;
                    res += (t + 1) * (t + 2) / 2 - 1;
                    break;

                } else {
                    // System.out.println(2);
                    while (arr.get(j) + n2 == 1.0) {
                        t++;
                        res++;
                        j++;
                    }
                    k--;
                    while (arr.get(k) + n1 == 1.0) {
                        res += t;
                        k--;
                    }
                }
            }
        }

        return res;
    }
}
