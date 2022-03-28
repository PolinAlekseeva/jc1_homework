package my.task26_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTwo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w\\b");
        Matcher m = p.matcher("The United States is a federal republic that consists of 50 self-governing states and the DC." +
                "The US Congress is the legal institution that ensures both law-making, " +
                "and adequate control over the adherence to laws by the executive branch.");
        while(m.find()){
            System.out.print(m.group() + " ");

        }
    }
}
