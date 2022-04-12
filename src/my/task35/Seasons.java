package my.task35;

import java.util.Arrays;

public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    String description;

    int countOfDays;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Seasons.values()) + " ");
    }
}
