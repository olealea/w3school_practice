package w3school_practice;

import java.util.Scanner;

public class Ex_07 {
//    Write a Java program to find the number of days in a month.
//
//    Input a month number: 2
//    Input a year: 2016
//    Expected Output :
//    February 2016 has 29 days

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month number:");
        int nrMonth = scanner.nextInt();
        System.out.println("Year :");
        int year = scanner.nextInt();
        System.out.println(monthNumber(nrMonth,year));
    }

    public static String monthNumber(int number, int year){
        switch (number){
            case 1:
                return "January "+year+" has 31 days";
            case 2:
                if (year%4==0)
                    return "February "+year+" has 29 days";
                else
                    return "February "+year+" has 28 days";
            case 3:
                return "March "+year+" has 31 days";
            case 4:
                return "April "+year+" has 30 days";
            case 5:
                return "May "+year+" has 31 days";
            case 6:
                return "June "+year+" has 30 days";
            case 7:
                return "July "+year+" has 31 days";
            case 8:
                return "August "+year+" has 31 days";
            case 9:
                return "September "+year+" has 30 days";
            case 10:
                return "October "+year+" has 31 days";
            case 11:
                return "November "+year+" has 30 days";
            case 12:
                return "December "+year+" has 31 days";
            default:
                return "Doesn't exist bro !!!";
        }
    }
}
