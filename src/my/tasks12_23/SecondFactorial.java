package my.tasks12_23;

import java.math.BigInteger;

public class SecondFactorial {
    public static void main(String[] args) {

        System.out.println("Multiplying  is " + getFactorial());

    }

    public static BigInteger getFactorial() {
        BigInteger result = BigInteger.ONE;
        int i = 1;
        do {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }
        while (i <=25);
        {
            return result;
        }
    }

}
