package w3school_practice;

public class Ex_19 {
//    Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
//                            1
//                           2 2
//                          3 3 3
//                         4 4 4 4
public static void main(String[] args) {
    int n = 4;
    int m = 1;
    for (int i=0;i<n;i++){
        for (int j=0; j<n-i; j++){
            System.out.print(" ");
        }
        for (int k=0; k<=i;k++){
            System.out.print(m+" ");
        }
        System.out.println("");
        m++;
    }
}
}
