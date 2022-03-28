package my.task26_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {

    int count = 0;
    Pattern p = Pattern.compile("\\b");
    Matcher m = p.matcher("The United States is considered to be one of the countries with the largest territories. " +
            "It is situated in North America, an amazing continent with its beautiful nature and diverse climatic zones." +
            "The country landscape includes both high mountains  and flat prairies.");
      while(m.find()){
        count++;
    }
    count/=2;

        System.out.println("There are " + count + " words.");

    }
}
