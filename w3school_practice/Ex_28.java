package w3school_practice;

import java.util.Scanner;

public class Ex_28 {
//    Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative".
//    Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
//
//    Input a number: -2534
//    Expected Output :
//    Negative
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Gimme the floating-point number");
        float n = s.nextFloat();
        System.out.println(getSign(n)+getRange(n));
    }
    public static String getRange(float number){
        if (number<0)
            return " small";
        else if(number>1000000)
            return " large ";
        else
            return "";
    }
    public static String getSign(float number){
        if (number>0)
            return "Number is positive";
        else if (number<0)
            return "Number is negative";
        else
            return "Number is zero";
    }
}
