package classes.class01;

import java.util.Scanner;

public class Operators {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise01();
    }

    public static void Exercise01() {
        System.out.print("Enter Your Number: ");
        int num = in.nextInt();  // Read user input

        boolean scaner = (num % 2 == 0) ? true : false ; // Check if the num is double
        System.out.println(scaner);
    }

}
