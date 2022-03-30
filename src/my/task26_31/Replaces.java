package my.task26_31;

public class Replaces {

    public static void main(String[] args) {

        String str = "<p id=\"p1\"> 123546 0x456f test <p align=\"right\">  tested";

        System.out.println(str.replaceAll("<p\\s+\\w+\\=\"\\w+\"\\>", "<p>"));

    }
}
