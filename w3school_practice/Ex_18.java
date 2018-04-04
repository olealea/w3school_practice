package w3school_practice;

public class Ex_18 {
//    Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like :
//        1
//        2 3
//        4 5 6
//        7 8 9 10
public static void main(String[] args) {
    int x = 0;
    int n = 4;
    for (int i = 0; i<n+2; i++){
        for (int j = 1; j < i; j++) {
            System.out.print(++x+" ");
        }
        System.out.println("");
    }
}
}
