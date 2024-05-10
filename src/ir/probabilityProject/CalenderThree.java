package ir.probabilityProject;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalenderThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int Year = sc.nextInt();
        System.out.println("Enter month");
        int Month = sc.nextInt();
        System.out.println("Enter day");
        int Day = sc.nextInt();

        int tYear, tMonth, tDay;


        tDay = Day + 1;
        tMonth = Month;
        tYear = Year;

        if (Month == 1 || Month == 2 || Month == 3 || Month == 4 || Month == 5 || Month == 6) {

            if (tDay >= 31) {
                tMonth = Month + 1;
                tDay = 1;
            }
        } else if (Month == 7 || Month == 8 || Month == 9 || Month == 10 || Month == 11) {

            if (tDay >= 30) {
                tMonth = Month + 1;
                tDay = 1;
            }
        } else {

            if ((Year % 4 == 0) && (!(Year % 100 == 0) || (Year % 400) == 0)) {

                if (tDay >= 30) {
                    tMonth = 1;
                    tDay = 1;
                    tYear = Year +1;
                }
            } else {
                if (tDay >= 29) {
                    tMonth = 1;
                    tDay = 1;
                    tYear = Year + 1;
                }
            }
        }



        System.out.println("Today's date is: " + Month +
                "/" + Day + "/" + Year + ".");
        System.out.println("Tomorrow's date will be: " + tMonth +
                "/" + tDay + "/" + tYear + ".");

    }
}



