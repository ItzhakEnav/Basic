package classes.class01;

import java.util.Scanner;

public class DataTypeNonPrimitives {
    static Scanner in = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        //Exercise01();
        //Exercise02();
        Exercise03();
    }

    public static void Exercise01() {
        System.out.print("Enter Your First Name: ");
        String FirstName = in.nextLine();  // Read user input

        System.out.print("Enter Your Last Name: ");
        String userLastName = in.nextLine();  // Read user input

        System.out.print("Enter Your Age: ");
        int myAge = in.nextInt();  // Read user input

        String ageAsString = Integer.toString(myAge); // Casting the int myAge to string AGE
        System.out.println("User Age is: " + ageAsString);

        String fullName = FirstName + " " + userLastName; // Threading the First Name & userLastName to FullName

        System.out.println(fullName.toUpperCase()); // To print the FullName in big latter's

        System.out.println(fullName.length()); // To print the numbers of latter's of the string FullName

        System.out.println(ageAsString.equals(fullName.length())); // To print the outcome of the compare between AGE.length to FullName.length
    }

    public static void Exercise02() {
        String[] arry = {"Java", "is", "a", "general", "purpose", "computer", "programming", "language"};
        System.out.print(arry[arry.length - 3] + " ");
        System.out.print(arry[arry.length - 2] + " ");
        System.out.println(arry[arry.length - 1]);

        String str = "Java is a general purpose computer programming language";
        String[] lastWords = str.split(" ");
        System.out.print(lastWords[lastWords.length - 3] + " ");
        System.out.print(lastWords[lastWords.length - 2] + " ");
        System.out.println(lastWords[lastWords.length - 1]);

    }

    static private void Exercise03() {
        String[][] DoMmdy = {{"Moshe", "22","Jerusalem"},{"Joseph","45","London"}};
        System.out.println(DoMmdy[0][2]);

    }
}

