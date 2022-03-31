package my.task26_31;

public class Append {

    public static String buildString (){

        String result = "aaabbbccc";

        for (int i = 0; i <= 1000_000; i++) {
            result += i;
        }
        return result;
    }

    public static String buildStringBuilder() {
        StringBuilder result = new StringBuilder("aaabbbccc");

        for (int i = 0; i <= 1000_000; i++) {

            result.append(i);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
//        buildString();
        buildStringBuilder();
        long t2 = System.currentTimeMillis();
        System.out.println("Result: " + ( t2- t1));
    }
}

