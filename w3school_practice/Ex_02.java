package w3school_practice;

public class Ex_02 {
//    Write a Java program to solve quadratic equations (use if, else if and else).
//
//    Input a: 1
//    Input b: 5
//    Input c: 1
//    Expected Output :
//    The roots are -0.20871215252208009 and -4.7912878474779195

    public static void main(String[] args) {
        int a = 1, b = 5, c = 1;
        System.out.println(getRoots(a, b, c));

    }

    public static String getRoots(int a, int b, int c){
        int delta = b*b - 4*a*c;
        if (delta < 0)
            return "No solutions";
        else if (delta == 0)
            return "Single solution is " + - b / (2*a);
        else {
            double x1 = (- b + Math.sqrt(delta)) / 2*a;
            double x2 = (- b - Math.sqrt(delta)) / 2*a;
            return "Roots are "+ x1 +" and "+x2;
        }
    }
}
