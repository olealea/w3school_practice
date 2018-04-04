package w3school_practice;

import java.util.Scanner;

public class Ex_12 {
//    Write a program in Java to input 5 numbers from keyboard and find their sum and average.
//
//    Input the 5 numbers : 1 2 3 4 5
//    Expected Output :
//    Input the 5 numbers :
//            1
//            2
//            3
//            4
//            5
//    The sum of 5 no is : 15
//    The Average is : 3.0
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the 5 numbers:");
    int sum = 0;
    for (int i=0; i<5; i++){
        int nr = scanner.nextInt();
        sum+=nr;
    }
    double avg = sum / 5;
    System.out.println("The sum of 5 no is : "+sum);
    System.out.println("The Average is : "+avg);
}
}
