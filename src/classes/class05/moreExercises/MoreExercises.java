package classes.class05.moreExercises;

public class MoreExercises {
    public static String Ex06(int number) {
        String num = Integer.toString(number);
        String numbers = "";
        for (int i = 1; i <= num.length(); i++) {
            numbers += num.charAt(num.length()  - i);
        }
        return numbers;
    }
}
