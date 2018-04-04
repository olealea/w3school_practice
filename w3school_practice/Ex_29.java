package w3school_practice;

public class Ex_29 {
//    Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
//
//    Input an integer number less than ten billion: 125463
//    Expected Output :
//    Number of digits in the number: 6
public static void main(String[] args) {
    int n = 1254683;
    System.out.println(countDigits(n));
}
public static int countDigits(int number){
   int count = 0;
    while(number!=0)
    {number=number/10;
    ++count;}
    return count;
}
}
