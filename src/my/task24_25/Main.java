package my.task24_25;

public class Main {
    public static void main(String[] args) {

        Time time1 = new Time(35000);
        Time time2 = new Time(50, 57, 7);


        System.out.println("The object2 has " + time2.getSec() + " seconds.");

        if (time1.equals(time2)){
            System.out.println("The object1 is equal to object2.");
        }
        else{
            System.out.println("The object1 is not equal to object2.");
        }
    }
}

