package w3school_practice;

public class Ex_21 {
//    Write a program in Java to display the pattern like a diamond.
//
//    Input number of rows (half of the diamond) : 7
//    Expected Output :
//
//                  *
//                 ***
//                *****
//               *******
//              *********
//             ***********
//            *************
//             ***********
//              *********
//               *******
//                *****
//                 ***
//                  *

    public static void main(String[] args) {
        char ch = '*';
        int n = 7;
        int x = n;
        for (int i=1; i<=n; i++){
            for (int j=1; j<x; j++)
                System.out.print(" ");
            x--;
            for (int k=1; k<=2*i-1; k++)
                System.out.print(ch);
            System.out.println("");
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++)
                System.out.print(" ");
            for (int k=0; k<n-2*i+4; k++)
                System.out.print(ch);
            System.out.println("");
        }

//method from w3schools:
//
//        for (int i=0; i<=n; i++){
//            for (int j=1; j<=n-i; j++)
//                System.out.print(" ");
//            for (int j=1; j<=2*i-1; j++)
//                System.out.print("*");
//            System.out.println("");
//        }
//        for (int i=n-1; i>=1; i--){
//            for (int j=1; j<=n-i; j++)
//                System.out.print(" ");
//            for (int j=1; j<=2*i-1; j++)
//                System.out.print("*");
//            System.out.println("");
//        }

    }
}
