package w3school_practice;

public class Ex_20 {
//    Write a program in Java to print the Floyd's Triangle.
//
//    Input number of rows : 5
//    Expected Output :
//            1
//            01
//            101
//            0101
//            10101
public static void main(String[] args) {
    int n = 5;
    int m = 1;
    for (int i=0; i<=n; i++){
        for (int j=0; j<i; j++){
            System.out.print(m);
            m = (m==0) ? 1 : 0;
        }
        System.out.println("");

    }
}
}
