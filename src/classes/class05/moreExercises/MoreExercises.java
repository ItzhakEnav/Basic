package classes.class05.moreExercises;

public class MoreExercises {
    public static String Ex06(int number) {
        String num = Integer.toString(number);
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= num.length(); i++) {
            numbers.append(num.charAt(num.length() - i));
        }
        return numbers.toString();
    }
    public static String Ex07(double number){
        String num = Double.toString(number);
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= num.length(); i++) {
            numbers.append(num.charAt(num.length() - i));
        }
        return numbers.toString();
    }
}
