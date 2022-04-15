package my.tasks39_42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Marks {

    public static void main(String[] args) {


        List<Integer> badMarks = new ArrayList<>();
        badMarks.add(5);
        badMarks.add(4);
        badMarks.add(6);
        badMarks.add(9);
        badMarks.add(10);

        Iterator<Integer> marksIterator = badMarks.iterator();
        while (marksIterator.hasNext()) {

            Integer nextInteger = marksIterator.next();

            if (nextInteger.intValue()<=6){
                marksIterator.remove();
            }
        }
        System.out.println(badMarks.toString());
    }
}
