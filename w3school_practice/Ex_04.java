package w3school_practice;

public class Ex_04 {
//    Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1
//    when m is less than 0.
//
//    Input a number: 25
//    Expected Output :
//    The value of m = 25.0
//    The value of n = 1

    public static void main(String[] args) {
        double m = 25;
        System.out.println("m = " + m);
        System.out.println("n = " + getResult(m));
    }

    public static int getResult(double number){
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }
}
