package my.tasks12_23;

public class DigitSum {
    public static void main(String[] args) {
        long num = 7_893_823_445L;
        long sum = 0;

        do {
            sum = sum + num % 10 ;
            num /= 10;

        }
        while (num != 0);

        System.out.println("Sum of digit is " + sum);

    }
}
