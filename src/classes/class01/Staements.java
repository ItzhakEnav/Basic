package classes.class01;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Staements {
    static Scanner in = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        // Exercise01();
        // Exercise02();
        Exercise03();
    }

    public static void Exercise01() {
        System.out.println("Exercise 01");
        System.out.println("\nPart A:"); // part a
        String[] arry = {"Austria", "Germany", "Canada", "Peru", "Israel"};
        for (String str : arry) {
            System.out.println(str);
        }
        System.out.println("\n\nPart B:"); // part b
        for (String str : arry) {
            if (str.equals("Israel")) {
                System.out.println(str);
            }
        }
        System.out.println("\n\nPart C:"); // part c

        System.out.println(arry[2].equals("China") ? "Yes, it is there" : "NO, sorry...");

        System.out.println("\n\nPart D:"); // part d
        System.out.println(arry[0].length());
    }

    public static void Exercise02() {
        System.out.println("Exercise 02");
        int[] numbers = {15, 2, 36, 20, 7};

        System.out.println("Part A:");
        if (numbers[0] > numbers[1]) {
            System.out.println("First One Is Bigger");
        } else {
            System.out.println("Second One Is Bigger");
        }

        System.out.println("\nPart B:");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        System.out.println("\nPart C:");
        int biggest = 0;
        for (int number : numbers) {
            if (number > biggest)
                biggest = number;
        }
        System.out.println(biggest);

    }

    public static void Exercise03() {
        System.out.print("Exercise 03\nEnter yor age: ");
        int age = in.nextInt();  // Read user input
        if (age <= 6 && age >= 0) {
            System.out.println("Go to Kindergarten");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Go to School");
        } else if (age >= 19 && age <= 67) {
            System.out.println("Go to Work");
        } else if (age >= 68 && age <= 120) {
            System.out.println("Collecting Pension");
        } else {
            System.out.println("You are dead :( ");
        }

    }

    public static void Exercise04() {

    }

}
