package my.tasks39_42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedNumbers {

    public static void main(String[] args) {

        List<Integer> repeatedNumbers = new ArrayList<>();
        repeatedNumbers.add(25);
        repeatedNumbers.add(103);
        repeatedNumbers.add(25);
        repeatedNumbers.add(70);
        repeatedNumbers.add(103);

        HashSet set = new HashSet(repeatedNumbers);
        repeatedNumbers.clear();
        repeatedNumbers.addAll(set);

        System.out.println(repeatedNumbers);//first way


//        for(int i = 0; i< repeatedNumbers.size()-1;i++) {
//            for(int j = repeatedNumbers.size()-1; j>i; j--){
//                if(repeatedNumbers.get(j).equals(repeatedNumbers.get(i))){
//                    repeatedNumbers.remove(j);    // Second Way
//
//                }
//
//            }
//        }

    }
}
