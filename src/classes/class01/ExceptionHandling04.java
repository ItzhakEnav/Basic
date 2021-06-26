package classes.class01;

public class ExceptionHandling04 {
    public static void main(String[] args) {
        //Exercise01();
        Exercise01();
        //Exercise02();
    }

    public static void ClassExercise01() {
        int[] arry = {1, 2};

        try {
            System.out.println(arry[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void Exercise01() {

    }
}
