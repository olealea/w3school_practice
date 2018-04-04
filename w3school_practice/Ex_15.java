package w3school_practice;

import java.util.Scanner;

public class Ex_15 {
//    Write a program in Java to display the n terms of odd natural number and their sum.
//
//    Input number of terms is: 5
//    Expected Output :
//    The odd numbers are :
//            1
//            3
//            5
//            7
//            9
//    The Sum of odd Natural Number upto 5 terms is: 25

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of terms is:");
    int number = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i<number*2;i++)
    {
        if (i % 2 != 0) {
            System.out.println(i);
            sum +=i;
        }
    }
    System.out.println("The Sum of odd Natural Number upto "+number+" terms is: "+sum);
}
}
