package my.tasks3_11;

public class Money {
    public static void main(String[] args) {

        int summa = 505;

        if (summa % 10 == 1) {
            System.out.println(summa + " рубль");
        } else if (summa % 10 == 2 || summa % 10 == 3 || summa % 10 == 4) {
            System.out.println(summa + " рубля");
        } else  {
            System.out.println(summa + " рублей");
        }
    }
}
