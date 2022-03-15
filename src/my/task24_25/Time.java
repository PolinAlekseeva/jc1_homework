package my.task24_25;

public class Time {
    int sec;
    int min;
    int hour;


    public Time ( int s){

        sec = s;

    }

    int getSec(){
        return sec;

    }

    public Time (int s, int m, int h) {

        sec = s;
        min = m;
        hour = h;

    }

    int getTime(){

        return hour * 3600 + min*60 + sec;
    }

}
