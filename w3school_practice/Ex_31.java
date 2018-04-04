package w3school_practice;

import java.util.Scanner;

public class Ex_31 {
//    Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing"
//            if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
//
//    Input first number: 1524
//    Input second number: 2345
//    Input third number: 3321
//    Expected Output :
//    Increasing order
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input first number:");
    int nr1 = s.nextInt();
    System.out.println("Input second number:");
    int nr2 = s.nextInt();
    System.out.println("Input third number:");
    int nr3 = s.nextInt();
    System.out.println(compareOrder(nr1,nr2,nr3));
}
public static String compareOrder(int a, int b, int c){
    if(a<b && b<c)
        return "Increasing";
    else if(a>b && b>c)
        return "Decreasing";
    else
        return "Neither increasing or decreasing order";
}
}
