package my.task26_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hexadecimal {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0[xX][0-9A-Fa-f]+");
        Matcher m = p.matcher("0X5a3miihy some text needed here 1235, 45654, 0xfaee");
        while (m.find()) {
            System.out.println("Hexadecimal number is " + m.group() + " ");

        }
    }
}
