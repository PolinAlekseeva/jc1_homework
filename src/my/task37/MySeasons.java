package my.task37;

import java.util.Scanner;

public class MySeasons {

    public enum SeasonsOfYear {

        WINTER,
        SPRING,
        SUMMER,
        FALL;

    }

    public enum SeasonsDays {

        JAN(31, SeasonsOfYear.WINTER),
        FEB(28, SeasonsOfYear.WINTER),
        MARCH(31, SeasonsOfYear.SPRING),
        APR(30, SeasonsOfYear.SPRING),
        MAY(31, SeasonsOfYear.SPRING),
        JUNE(30, SeasonsOfYear.SUMMER),
        JULY(31, SeasonsOfYear.SUMMER),
        AUG(31, SeasonsOfYear.SUMMER),
        SEPT(30, SeasonsOfYear.FALL),
        OCT(31, SeasonsOfYear.FALL),
        NOV(30, SeasonsOfYear.FALL),
        DEC(31, SeasonsOfYear.WINTER);

        final int i;
        final SeasonsOfYear season;

        SeasonsDays(int i, SeasonsOfYear season) {
            this.i = i;
            this.season = season;
        }

        public int getDays() {
            return i;
        }

        public static void main(String[] args) {
            while (true) {
                System.out.print("Please, enter any Season of the year with capital letter: ");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                System.out.println("Now we will know the quantity of days in this season.");

                switch (s) {

                    case "Winter":
                        System.out.println("There are " + (SeasonsDays.JAN.getDays() + SeasonsDays.FEB.getDays()
                                + SeasonsDays.DEC.getDays()) + " days in this season.");
                        break;
                    case "Spring":
                        System.out.println("There are " + (SeasonsDays.MARCH.getDays() + SeasonsDays.APR.getDays() + SeasonsDays.MAY.getDays()) +
                                " days in this season.");
                    case "Summer":
                        System.out.println("There are " + (SeasonsDays.JUNE.getDays() + SeasonsDays.JULY.getDays() + SeasonsDays.AUG.getDays()) +
                                " days in this season.");
                    case "Fall":
                        System.out.println("There are " + (SeasonsDays.SEPT.getDays() + SeasonsDays.OCT.getDays() + SeasonsDays.NOV.getDays()) +
                                " days in this season.");
                        break;
                    default:
                        System.out.println("Unknown value. Please check the name of the Season and if your first letter is Big.");
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
}

