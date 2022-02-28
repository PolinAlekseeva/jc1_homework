package my.tasks3_11;

public class Time {
    public static void main(String[] args) {
        int s = 750_600;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int w = (d - days) / 7;



        System.out.println( w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд.");

    }
}
