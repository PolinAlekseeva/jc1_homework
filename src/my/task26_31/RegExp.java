package my.task26_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher("What a beautiful day is today!! Learning a foreign language gives you chances to appreciate a new literature, a different culture!");
        while(m.find()){
            count++;

        }
        System.out.println("There are " + count + " punctuation characters.");

    }
}
