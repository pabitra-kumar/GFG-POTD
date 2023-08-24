package August;

import java.math.BigInteger;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        String s1 = "0033";
        String s2 = "0002";
        MultiplyTwoStrings ob = new MultiplyTwoStrings();
        String res = ob.multiplyStrings(s1, s2);
        System.out.println(res);
    }

    public String multiplyStrings(String s1, String s2) {
        BigInteger num1 = new BigInteger(s1);

        BigInteger num2 = new BigInteger(s2);

        BigInteger product = num1.multiply(num2);

        return product.toString();
    }
}