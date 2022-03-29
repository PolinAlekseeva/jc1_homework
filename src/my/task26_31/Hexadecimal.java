package my.task26_31;

public class Hexadecimal {
    public static void main(String[] args) {
        String s1 = "0x5AFE";
        System.out.println(s1.matches("0x[0-9a-fA-F]{1,4}"));
    }
}
