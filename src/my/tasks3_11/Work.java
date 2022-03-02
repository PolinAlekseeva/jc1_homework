package my.tasks3_11;

public class Work {
    public static void main(String[] args) {

        Boxes myBoxes = new Boxes();
        System.out.println("Результат: " + new Boxes().getRes1());
    }
}
class Boxes {
    int num1 = 5;
    int num2 = 10;
    int res1 = (num1 + num2) + (num1 * num2);

    int getRes1() {

        return res1;
    }
}




