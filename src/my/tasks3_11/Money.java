package my.tasks3_11;

public class Money {
    public static void main(String[] args) {

        int summa = 3200;
        if (summa < 3200) {
            System.out.println(summa + " рубли");
        } else if (summa > 3200) {
            System.out.println(summa + " рубль");
        } else if (summa >= 3200) {
            System.out.println(summa + " рублей");
        }
    }
}
