package my.tasks12_23;

public class PrimeNumber {
    public static void main(String[] args) {
        int a;
        int b;
        boolean bool = true;
        boolean second = false;
        for (a = 50; a <= 70; a++) {
            bool = true;

            for (b = 2; b < a; b++) {
                if (a % b == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                if (second) {
                    System.out.println("Second prime number is " + a);
                    break;
                }
                second = true;

            }
        }
    }
}
