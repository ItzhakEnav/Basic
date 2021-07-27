package classes.class05.moreExercises;

public class FinalMain {
    public static void main(String[] args) {
        String[] sung = {"hi", "i heard", "you were", "a wild one"};
        FinalFunctions.Ex01(new int[]{3, 2, 7, 23, 73, 64, 4, 85, 99, 100, 60, 1, 76});
        FinalFunctions.Ex02(10, 20, 30, 40);
        FinalFunctions.Ex03(sung);
        FinalFunctions.Ex04(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        FinalFunctions.Ex05PartOne(sung);
        String[] search = FinalFunctions.Ex05PartTwo(sung, "h");
        for (String word : search) {
            System.out.println(word);
        }
    }
}
