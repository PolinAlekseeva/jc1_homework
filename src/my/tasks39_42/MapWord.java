package my.tasks39_42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapWord {

    public static void main(String[] args) {

        System.out.println("Please enter the text: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(" ");

        Map<String, Integer> counterWord = new HashMap<>();

        for(String word: strArr){
            counterWord.put(word, counterWord.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry e: counterWord.entrySet()){

            System.out.println(e.getKey() + " : " + e.getValue());

        }
    }
}
