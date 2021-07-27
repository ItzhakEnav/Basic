package classes.class05.moreExercises;

import java.util.Arrays;
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
        LinkedList<Integer> list = new LinkedList<>();
        while (list.size() < sung.length) {
            int contain = rand.nextInt(sung.length);
            if (!list.contains(contain)) {
                System.out.println(sung[contain]);
                list.add(contain);
            }
        }
    }

    public static void Ex04(int[] numbers) {
        for (int number : numbers) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++)
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime) {
                System.out.println(number);
            }
        }

    }

    public static void Ex05PartOne(String[] song) {
        String bigWord = "";
        for (String word : song) {
            if (bigWord.length() < word.length()) {
                bigWord = word;
            }
        }
        System.out.println(bigWord);
    }

    public static String[] Ex05PartTwo(String[] song, String search) {
        LinkedList<String> result = new LinkedList<>();
        for (String word : song) {
            if (word.contains(search)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}