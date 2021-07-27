package classes.class05.moreExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FinalFunctions {
    private static Random rand = new Random();

    public static void Ex01(int[] numbers) {
        List<Integer> ordersNumbers = new LinkedList<>();
        for (int number : numbers) {
            if (number % 4 == 0) {
                ordersNumbers.add(number);
            }
        }
        System.out.println(ordersNumbers);
    }

    public static void Ex02(int... numbers) {
        int length = numbers.length;
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[length / 2]);
        } else {
            int result = (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
            System.out.println(result);
        }
        //for (int number:numbers) {
        //}
    }

    public static void Ex03(String[] sung) {
        LinkedList list = new LinkedList();
        while (list.size() < sung.length) {
            int contain = rand.nextInt(sung.length);
            if (!list.contains(contain)) {
                System.out.println(sung[contain]);
                list.add(contain);
            }
        }
    }
}
