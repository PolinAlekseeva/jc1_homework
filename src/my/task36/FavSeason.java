package my.task36;

import java.util.Scanner;

public enum FavSeason {
    SUMMER,
    FALL,
    WINTER,
    SPRING;


    public static void main(String[] args) {

        while (true) {
            System.out.print("Please, enter your favourite Season with capital letter: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println("Now we will know next season.");

            switch (s) {
                case "Winter":
                    System.out.println("Following season is " + FavSeason.SPRING);
                    break;
                case "Spring":
                    System.out.println("Following season is " + FavSeason.SUMMER);
                    break;
                case "Summer":
                    System.out.println("Following season is " + FavSeason.FALL);
                    break;
                case "Fall":
                    System.out.println("Following season is " + FavSeason.WINTER);
                    break;
                default:
                    System.out.println("Unknown value. Please check if your first letter is Big.");

            }
            checkExitOrContinue();
        }
    }

    private static void checkExitOrContinue() {
        System.out.print("Please enter [E] to exit or any key to continue: ");
        String command = new Scanner(System.in).next();
        if (command.equalsIgnoreCase("E")) {
            System.exit(0);
        }
    }
}
