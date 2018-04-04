package w3school_practice;

public class Ex_01 {
//    Write a Java program to get a number from the user and print whether it is positive or negative.
//
//    Input number: 35
//    Expected Output :
//    Number is positive

    public static void main(String[] args) {
        int x = 35;

        //Condition for case of x modified...
        System.out.print("Number is ");
        if (x != 0)
            System.out.println(isPositive(x) ? "positive" : "negative");
        else System.out.println("zero");
    }

    public static boolean isPositive(int a){
        return (a>0);
    }
}
