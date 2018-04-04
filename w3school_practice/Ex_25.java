package w3school_practice;

public class Ex_25 {
//    Write a Java program to display the number rhombus structure.
//
//    Input the number: 7
//    Expected Output :
//
//                  1
//                 212
//                32123
//               4321234
//              543212345
//             65432123456
//            7654321234567
//             65432123456
//              543212345
//               4321234
//                32123
//                 212
//                  1
public static void main(String[] args) {
    int n=7;
    int k=1, sp=1, st;
//    height of rhombus(height = double input number), one cycle=what happens per one line.
    for(int i=1; i<n*2; i++)
    {
//        pre-spacing, calculating how many spaces are needed (6 spaces on first line, so on)
        for(int j=n-sp; j>0;j--)
            System.out.print(" ");
//        if before middle, else after middle (on first iteration: line 1, number=1)
        if (i<n){
            st=i;
            sp++;
        }else {
            st=n*2-i;
            sp--;
        }
//        printing numbers, width of rhombus (k = number of digits per line)
        for(int j=0; j<k; j++) {
            System.out.print(st);
//            if before middle of line - decrease digit, else - increase digit
            if (j < k / 2)
                st--;
            else
                st++;
        }
//        if line<input number increase by 2 the number of digits, and viceversa
        if (i<n)
            k+=2;
        else
            k-=2;
//        get the new line and go on!
        System.out.println("");
    }
}
}

