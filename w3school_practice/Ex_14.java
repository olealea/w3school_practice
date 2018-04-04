package w3school_practice;

public class Ex_14 {
//    Write a program in Java to display the multiplication table of a given integer.
//
//    Input the number (Table to be calculated) : Input number of terms : 5
//    Expected Output :
//            5 X 0 = 0
//            5 X 1 = 5
//            5 X 2 = 10
//            5 X 3 = 15
//            5 X 4 = 20
//            5 X 5 = 25
public static void main(String[] args) {
    int number = 5;
    for (int i = 0; i<=number;i++){
        System.out.println(number+" X "+i+" = "+number*i);
    }

}
}
