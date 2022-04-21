package my.tasks39_42;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MaxNum {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        marks.add(7);
        marks.add(10);
        marks.add(8);
        marks.add(6);
        marks.add(7);

        ListIterator<Integer> marksGoodListIterator = marks.listIterator();

        int max = marksGoodListIterator.next();

        while(marksGoodListIterator.hasNext()){

            int current = marksGoodListIterator.next();
            if(current > max){
                max = current;
            }

        }
        System.out.println(max);

    }

}
