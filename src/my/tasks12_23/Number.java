package my.tasks12_23;

import java.text.NumberFormat;

public class Number {

    public static void main(String[] args) {

        NumberFormat f = NumberFormat.getInstance();
        int i = 56789156;
        System.out.println(f.format(i));

    }
}
