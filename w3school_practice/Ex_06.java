package w3school_practice;

public class Ex_06 {
//    Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
//
//    Input floating-point number: 1256
//    Input floating-point another number: 3254
//    Expected Output :
//    They are different

    public static void main(String[] args) {
        double number1 = 1256.3335, number2 = 1256.3332;
        if (areSame(number1,number2))
            System.out.println("They are same up to 3 decimal places");
        else System.out.println("They are different");

    }

    public static boolean areSame(double a, double b){
        a = Math.round(a * 1000);
        a = a / 1000;
        b = Math.round(b * 1000);
        b = b / 1000;
        return (a == b);
    }
}
