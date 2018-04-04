package w3school_practice;

import java.util.Scanner;

public class Ex_08 {
//    Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input.
//    If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//    Input an alphabet: p
//    Expected Output :
//    Input letter is Consonant
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an alphabet:");
    char ch = scanner.next().charAt(0);
    System.out.print("Input letter is ");
    System.out.print(isConsonant(ch) ? "Vowel" : "Consoant");
}

    public static boolean isConsonant(char ch){
     return  (ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i');
    }
}
