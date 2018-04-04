package w3school_practice;

import java.util.Scanner;

public class Ex_30 {
//    Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different"
//            if all three numbers are different and "Neither all are equal or different" otherwise.
//
//    Input first number: 2564
//    Input second number: 3526
//    Input third number: 2456
//    Expected Output :
//    All numbers are different

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input first number:");
    int nr1 = s.nextInt();
    System.out.println("Input second number:");
    int nr2 = s.nextInt();
    System.out.println("Input third number:");
    int nr3 = s.nextInt();
    System.out.println(compareNumbers(nr1,nr2,nr3));
}
public static String compareNumbers(int a, int b, int c){
    if (a==b && b==c)
        return "All numbers are equal";
    else if (a!=b && b!=c)
        return "All numbers are different";
    else
        return "Neither all are equal or different";
}
}
