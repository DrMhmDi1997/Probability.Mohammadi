package ir.probabilityProject;

import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {

        int m, year, week, month, day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        m = sc.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.println("Number of years" + year);
        month = m / 30;
        m = m % 30;
        System.out.println("Number of months" + month);
        week = m / 7;
        m = m % 7;
        System.out.println("Number of weeks" + week);
        day = m;
        System.out.println("Number of days" + day);

        if (day == 1 || day ==8 || day == 15 || day==22 || day ==29) {
            System.out.println("It is Monday");
        } else if (day == 2 || day==9 || day == 16 || day == 23 || day == 30) {
            System.out.println("It is Tuesday");
        } else if (day==3 || day== 10 || day ==17 || day ==24) {
            System.out.println("It is Wednesday");
        } else if (day==4 || day ==11 || day ==18 || day == 25) {
            System.out.println("It is Thursday");
        } else if (day ==5 || day ==12 || day ==19 || day == 26) {
            System.out.println("It is Friday");
        } else if (day == 6 || day ==13 || day == 20 || day == 27) {
            System.out.println("It is Saturday");
        } else if (day == 7 || day == 14 || day == 21 || day == 28) {
            System.out.println("It is Sunday");
        }


    }

    }

