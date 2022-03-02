package my.tasks3_11;

import java.util.Scanner;

public class Schedule {
        public static void main(String[] args) {

            Timetable myTimetable = new Timetable();
            System.out.println("Расписание на неделю: \n" + new Timetable().getTimetable());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            int day = scanner.nextInt();

            System.out.println(getDayName(day));

        }

        public static String getDayName(int day) {
            String dayName = " ";
            switch(day) {
                case 1: dayName = "Понедельник: кружок по плаванию в 18.00.\n";
                    break;
                case 2: dayName = "Вторник: танцы в 15.00.\n";
                    break;
                case 3: dayName = "Среда: танцы в 15.00.\n";
                    break;
                case 4: dayName = "Четверг: танцы в 15.00.\n";
                    break;
                case 5: dayName = "Пятница: танцы в 15.00.\n";
                    break;
                case 6: dayName = "Суббота: танцы в 15.00.\n";
                    break;
                case 7: dayName = "Воскресенье: танцы в 15.00.\n";
                    break;
                default:
                    System.out.println("День с таким нмером не существует.");

            }
            return dayName;}

    }

    class Timetable {

        String day;

        String day1 = "Понедельник: кружок по плаванию в 18.00.\n";
        String day2 = "Вторник: танцы в 15.00.\n";
        String day3 = "Среда: массаж в медцентре.\n";
        String day4 = "Четверг: приготовить рыбу и разморозить грибы.\n";
        String day5 = "Пятница: записаться на техосмотр.\n";
        String day6 = "Суббота: собираемся у нас, контрольное время 16.00\n";
        String day7 = "Воскресенье: покупки и подготовка к рабочей неделе.";
        String day8 =day1 + day2 + day3 + day4 + day5 + day6 + day7;

        String getTimetable(){
            return day8;

        }
}


