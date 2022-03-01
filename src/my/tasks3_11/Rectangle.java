package my.tasks3_11;


public class Rectangle {
    public static void main(String[] args) {

            int a = 3;
            int b = 7;
            int r = 5;


            if (2 * r >= Math.sqrt(a*a + b*b)) {
                System.out.println("Отверстие закрывается полностью.");
            }
            else{
                System.out.println("Отверстие не закрывается.");

            }

        }
    }

