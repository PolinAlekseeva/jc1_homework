package my.tasks3_11;

public class Work {
    public static void main(String[] args) {

        Boxes myBoxes = new Boxes();
        System.out.println("Результат: " + new Boxes().getRes1(5,10));
    }
}
class Boxes {

    int getRes1(int num1, int num2) {
        int res1 = (num1 + num2) + (num1 * num2);

        return res1;
    }
}




