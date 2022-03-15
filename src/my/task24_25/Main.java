package my.task24_25;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(35000);
        Time time2 = new Time(70000,350, 7);

        System.out.println("There are " + new Time(35000).getSec() + " seconds.");
        System.out.println("All seconds are " + new Time(70000,350, 7).getTime());

    }

}
