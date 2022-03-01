package my.tasks3_11;

public class House {
    public static void main(String[] args) {

    int a = 2, b = 7;
    int c = 1, d = 3;
    int e = 5, f = 8;


		if ((e >= (a + c)) && (f >= b && f >= d)) {
        System.out.println("1: На участке помещается 2 дома");
    } else if ((e >= (a + d)) && (f >= b && f >= c)) {
        System.out.println("2: На участке помещается 2 дома");
    }	else if ((e >= (b + c)) && (f >= a && f >= d)) {
        System.out.println("3: На участке помещается 2 дома");
    } else if ((e >= (b + d)) && (f >= a && f >= c)) {
        System.out.println("4: На участке помещается 2 дома");
    }
		else
                System.out.println("На участке не помещается 2 дома");
}
}

