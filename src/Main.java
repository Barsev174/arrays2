import java.util.Arrays;

public class Main {
    static int[] arr = generateRandomArray();

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        System.out.println("Ежемесячные траты " + Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + count() + " рублей.");
        // Задача 2
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за день составила " + minWaste() + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxWaste() + " рублей.");
        // Задача 3
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила " + average() + " рублей.");
        // Задача 4.
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int count() {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int maxWaste() {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minWaste() {
        int min = 200_000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double average() {
        return (double) count() / arr.length;
    }
}






