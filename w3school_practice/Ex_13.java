package w3school_practice;

import java.util.Scanner;

public class Ex_13 {
//    Write a program in Java to display the cube of the number upto given an integer.
//
//    Input number of terms : 4
//    Expected Output :
//    Number is : 1 and cube of 1 is : 1
//    Number is : 2 and cube of 2 is : 8
//    Number is : 3 and cube of 3 is : 27
//    Number is : 4 and cube of 4 is : 64
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of terms :");
    int nr = scanner.nextInt();
    for (int i=1; i<=nr;i++){
        System.out.println("Number is : "+i+" and its cube is : "+getCube(i));
    }
}
public static int getCube(int number){
    return number*number*number;
}
}
