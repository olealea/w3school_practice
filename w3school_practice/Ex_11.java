package w3school_practice;

import java.util.Scanner;

public class Ex_11 {
//    Write a program in Java to display n terms of natural numbers and their sum.
//
//    Input the number: 2
//    Expected Output :
//    Input number:
//            2
//    The first n natural numbers are :
//            0
//            1
//            2
//    The Sum of Natural Number upto n terms :
//            3
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number:");
    int n = scanner.nextInt();
    int sum = 0;
    System.out.println("The first "+n+" natural numbers are:");
    for (int i = 1; i <= n; i++){
        System.out.println(i);
        sum += i;
    }
    System.out.println("The Sum of Natural upto "+n+" terms:");
    System.out.println(sum);
}
}
