package w3school_practice;

public class Ex_23 {
//    Write a java program to generate a following *'s triangle.
//
//    Input the number: 6
//    Expected Output :
//            ******
//             *****
//              ****
//               ***
//                **
//                 *
public static void main(String[] args) {
    int n = 6;
    for(int i=n; i>=1; i--){
       //pre-spacing
        for(int j=0; j<n-i; j++)
            System.out.print(" ");
        //fixing the stars to the sky
        for(int k=1; k<=i; k++)
            System.out.print("*");
        System.out.println("");
    }
}
}
