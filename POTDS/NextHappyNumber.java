
public class NextHappyNumber {
    public static void main(String[] args) {
        System.out.println(nextHappy(13));
    }

    static int nextHappy(int n) {
        int i, sum = 0, a = 0, temp = 0, j = n;
        while (sum != 1) {
            j++;
            sum = j;
            for (i = 0; i < 999; i++) {
                if (sum > 1) {
                    temp = sum;
                    sum = 0;
                    while (temp != 0) {
                        a = temp % 10;
                        sum += a * a;
                        temp = temp / 10;
                    }
                } else {
                    return j;
                }
            }
        }
        return 0;
    }
}