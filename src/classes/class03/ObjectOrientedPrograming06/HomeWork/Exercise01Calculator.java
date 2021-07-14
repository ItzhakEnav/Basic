package classes.class03.ObjectOrientedPrograming06.HomeWork;


import java.util.Scanner;

public class Exercise01Calculator {
    static Scanner in = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        int Numbers = in.nextInt();// Enter the user input to Numbers
        String arry[] = {"22.7", "*", "4"};
        Calculator(arry);
    }

    public static void Calculator(String[] arry) {
        switch (arry[1]) {
            case "+":
                System.out.println(Double.parseDouble(arry[0]) + Double.parseDouble(arry[2]));
                break;
            case "-":
                System.out.println(Double.parseDouble(arry[0]) - Double.parseDouble(arry[2]));
                break;
            case "*":
                System.out.println(Double.parseDouble(arry[0]) * Double.parseDouble(arry[2]));
                break;
            case "/":
                System.out.println(Double.parseDouble(arry[0]) / Double.parseDouble(arry[2]));
                break;
            default:
                System.out.println("input not valid");
                break;
        }
    }
    public static String NumbersToWords(int Numbers){

        return null;
    }
}
