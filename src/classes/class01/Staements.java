package classes.class01;

public class Staements {
    public static void main(String[] args) {
        Exercise01();
    }

    public static void Exercise01() {
        System.out.println("\n\nPart A:"); // part a
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

        System.out.println(arry[2].equals("China")?"Yes, it is there": "NO, sorry...");

        System.out.println("\n\nPart D:"); // part d
        System.out.println(arry[0].length());


    }
}
