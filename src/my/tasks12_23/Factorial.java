package my.tasks12_23;

public class Factorial {

    public static void main(String[] args) {


        int res = 1;
        int i = 1;

        while (i <=10) {

            res *=i;
            i++;
        }

        System.out.println("Factorial is " + res);

    }
}

