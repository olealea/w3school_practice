package w3school_practice;

public class Ex_03 {
//    Take three numbers from the user and print the greatest number.
//
//    Input the 1st number: 25
//    Input the 2nd number: 78
//    Input the 3rd number: 87
//    Expected Output :
//    The greatest: 87

    public static void main(String[] args) {
        int first = 25, second = 78, third = 87;
        if (first!=second && first!=third)
            System.out.println("The greatest: "+getGreatest(first, second, third));
        else System.out.println("Numbers are not distinct");
    }

    public static int getGreatest(int a, int b, int c){
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;

    }
}
