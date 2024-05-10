package ir.probabilityProject;

import java.util.Scanner;

public class Probability {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int DayNumber = 0;
        String MonthName = "";
        System.out.println("Enter Month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();


        switch (month) {
            case 1:
                MonthName = "Farvardin";
                DayNumber = 31;
                break;
            case 2:
                MonthName = "Ordibehesht";
                DayNumber = 31;
                break;
            case 3:
                MonthName = "Khordad";
                DayNumber = 31;
                break;
            case 4:
                MonthName = "Tir";
                DayNumber = 31;
                break;
            case 5:
                MonthName = "Mordad";
                DayNumber = 31;
                break;
            case 6:
                MonthName = "Shahrivar";
                DayNumber = 31;
                break;
            case 7:
                MonthName = "Mehr";
                DayNumber = 30;
                break;
            case 8:
                MonthName = "Aban";
                DayNumber = 30;
                break;
            case 9:
                MonthName = "Azar";
                DayNumber = 30;
                break;
            case 10:
                MonthName = "Dey";
                DayNumber = 30;
                break;
            case 11:
                MonthName = "Bahaman";
                DayNumber = 30;
                break;
            case 12:
                MonthName = "Esfand";
                if ((year % 400 ==0) || (year % 4 == 0) && (year % 100 != 0)) {
                    DayNumber = 30;
                } else {
                    DayNumber = 29;
                }
        }
        System.out.println(MonthName + " " + year + "has" + DayNumber + "days/n");
    }
}
