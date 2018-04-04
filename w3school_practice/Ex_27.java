package w3school_practice;

import java.util.Scanner;

public class Ex_27 {
//    Write a Java program that reads an integer and check whether it is negative, zero, or positive.
//
//    Input a number: 7
//    Expected Output :
//    Number is positive

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Gimme a number:");
    int n = s.nextInt();
    System.out.println(getSign(n));
}
public static String getSign(int number){
    if (number>0)
        return "Number is positive";
    else if (number<0)
        return "Number is negative";
    else
        return "Number is zero";
}
}
