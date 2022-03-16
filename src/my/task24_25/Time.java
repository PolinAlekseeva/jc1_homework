package my.task24_25;

public class Time {

    int sec;
    int min;
    int hour;

    public Time(int sec) {
        this.sec = sec;
        System.out.println("Object time1 has " + this.sec + " seconds");
    }

    public Time(int s, int m, int h) {
        this.sec = s;
        this.min = m;
        this.hour = h;
        System.out.println("Object time2 has " + this.hour + " hours " + this.min + " minutes " + this.sec + " seconds");

    }

    int getSec() {
        return hour * 3600 + min * 60 + sec;

    }
}
