package w3school_practice;

public class Ex_24 {
//    Write a java program to generate a following @'s triangle.
//
//    Input the number: 6
//    Expected Output :
//         @
//        @@
//       @@@
//      @@@@
//     @@@@@
//    @@@@@@
public static void main(String[] args) {
    int n = 6;
    char ch = '@';
    for (int i=1; i<=n; i++){
        //pre-spacing
        for (int j=0; j<n-i; j++)
            System.out.print(" ");
        //character setting
        for (int k=1; k<=i;k++)
            System.out.print(ch);
        System.out.println("");
    }
}
}
