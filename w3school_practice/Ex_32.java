package w3school_practice;

public class Ex_32 {
//    Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
//
//    Input first floating­point number: 1235
//    Input second floating­point number: 2534
//    Expected Output :
//    These numbers are different.
public static void main(String[] args) {
    double nr1 = 10.200;
    double nr2 = 10.208;
    System.out.println(compareNumbers(nr1,nr2));
}
public static String compareNumbers(double a, double b){
    a = Math.round(a * 100);
    a = a / 100;
    b = Math.round(b * 100);
    b = b / 100;
    if (a == b)
        return "These numbers are same up to two decimal places";
    else
        return "These numbers are different.";
}
}
