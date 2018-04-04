package w3school_practice;

public class Ex_16 {
//    Write a program in Java to display the pattern like right angle triangle with a number.
//
//    Input number of rows : 10
//    Expected Output :
//            1
//            12
//            123
//            1234
//            12345
//            123456
//            1234567
//            12345678
//            123456789
//            12345678910

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i<n+2;i++ ){
            for (int j = 1; j<i; j++)
            System.out.print(j);
            System.out.println("");
        }

    }
}
