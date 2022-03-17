package my.task24_25;

public class Time {

    int sec;
    int min;
    int hour;

    public Time(int sec) {
        this.sec = sec;
        System.out.println("Object1 has " + this.sec + " seconds");

        this.hour = sec / 3600 % 24;
        sec %= 3600;
        this.min = sec / 60;
        this.sec = sec % 60;
        System.out.println("Object1 has " + this.hour + " Hours " + this.min + " Minutes " + this.sec + " seconds");

    }

    public Time(int s, int m, int h) {
        this.sec = s;
        this.min = m;
        this.hour = h;

        System.out.println("Object2 has " + this.hour + " hours " + this.min + " minutes " + this.sec + " seconds");

    }

    int getSec() {
        return this.hour * 3600 + this.min * 60 + this.sec;

    }
}

