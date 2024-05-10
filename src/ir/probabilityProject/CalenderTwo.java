package ir.probabilityProject;

import java.util.Scanner;

public class CalenderTwo {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        if (month == 1 || month == 2 || month == 3 || month == 4 || month ==5 || month ==6) {
            System.out.println("Number of days is 31");
        } else if (month == 7 || month==8 || month ==9 || month == 10 || month== 11) {
            System.out.println("Number of days is 30");
        } else if ((month == 12) && (year % 400 ==0) || (year % 4 == 0) || (year % 100 != 0)) {
            System.out.println("Number of days is 29");
            
        }


    }
}
