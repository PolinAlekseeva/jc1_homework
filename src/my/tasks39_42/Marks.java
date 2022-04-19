package my.tasks39_42;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class Marks {

    public static void main(String[] args) {


        List<Integer> badMarks = new ArrayList<>();
        badMarks.add(5);
        badMarks.add(4);
        badMarks.add(6);
        badMarks.add(9);
        badMarks.add(10);

        ListIterator<Integer> marksListIterator = badMarks.listIterator();
        while (marksListIterator.hasNext()) {

            Integer nextInteger = marksListIterator.next();

            if (nextInteger.intValue()<=6){
                marksListIterator.remove();
            }
        }
        System.out.println(badMarks.toString());
    }
}
