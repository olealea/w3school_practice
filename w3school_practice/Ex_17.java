package w3school_practice;

public class Ex_17 {
//    Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
//    The pattern is as follows :
//        1
//        22
//        333
//        4444

    public static void main(String[] args) {
        int n = 4;
        for (int i=0; i<n+2; i++){
            for (int j=1; j<i; j++)
                System.out.print(i-1);
            System.out.println("");
        }
    }
}
