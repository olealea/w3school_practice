package w3school_practice;

public class Ex_22 {
//    Write a Java program to display Pascal's triangle.
//
//    Input number of rows: 5
//    Expected Output :
//    Input number of rows: 5
//                1
//               1 1
//              1 2 1
//             1 3 3 1
//            1 4 6 4 1
public static void main(String[] args) {
    int n = 5;
    int i,j,k=1;
    for (i=0; i<n; i++){

        //pre-spacing
        for(int m =1; m<=n-i;m++)
            System.out.print(" ");

        //calculating Pascal's triangle numbers
        for(j=0; j<=i; j++){
            if (j==0||i==0)
                k=1;
            else k=k*(i-j+1)/j;
            System.out.print(" "+k);
        }
        System.out.println("");
    }
    }
}
