package w3school_practice;

public class Ex_05 {
//    Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
//
//    Input number: 3
//    Expected Output :
//    Wednesday
public static void main(String[] args) {
    int number = 3;
    System.out.println(getDayOfWeek(number));
}

public static String getDayOfWeek(int a){
    switch (a){
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "Whataya want from me?";
    }
}
}
