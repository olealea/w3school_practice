package w3school_practice;

public class Ex_26{
//Write a Java program to display the following character rhombus structure.
//
//        Input the number: 7
//        Expected Output :
//
//              A
//             ABA
//            ABCBA
//           ABCDCBA
//          ABCDEDCBA
//         ABCDEFEDCBA
//        ABCDEFGFEDCBA
//         ABCDEFEDCBA
//          ABCDEDCBA
//           ABCDCBA
//            ABCBA
//             ABA
//              A
public static void main(String[] args) {
    int n=7;
    int k=1, sp=1;
    char c='A';
//    height of rhombus(height = double input number), one cycle=what happens per one line.
    for(int i=1; i<n*2; i++)
    {
//        pre-spacing, calculating how many spaces are needed (6 spaces on first line, so on)
        for(int j=n-sp; j>0;j--)
            System.out.print(" ");
//        if before middle, else after middle (on first iteration: line 1, number=1)
        if (i<n){
            sp++;
        }else {
            sp--;
        }
//        printing letters, width of rhombus (k = number of letters per line)
        for(int j=0; j<k; j++) {
            System.out.print(c);
//            if before middle of line - decrease letter, else - increase letter
            if (j < k / 2)
                c++;
            else
                c--;
        }
//        if line<input number increase by 2 the number of letters, and viceversa
        if (i<n)
            k+=2;
        else
            k-=2;
        c = 'A';
//        get the new line and go on!
        System.out.println("");
    }
}
}
