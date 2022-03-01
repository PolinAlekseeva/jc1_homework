package my.tasks3_11;

public class Dates {
    public static void main(String[] args) {
        int day = 2;
        int month = 8;
        int year = 2022;

        if ( day <30 ) {
            if (day >1){
                day++;
                System.out.println(day + "." + month + "." + year + ".");
            }
        }else {
            System.out.println("Date is not found.");
        }
    }
}

