package w3school_practice;

import java.util.Scanner;

public class Ex_09 {
//    Write a Java program that takes a year from user and print whether that year is a leap year or not.
//
//    Input the year: 2016
//    Expected Output :
//            2016 is a leap year
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the year:");
    int year = scanner.nextInt();
    System.out.println((year%4==0) ? year+" is a leap year" : year+" is not a leap year");
}
}
