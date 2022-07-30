import java.sql.Array;
import java.util.Arrays;

public class Main {
    static int[] accountantsBook = generateRandomArray();


    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        System.out.println("Ежемесячные траты " + Arrays.toString(accountantsBook));// пока оставил это метод
        // хотется оставить Maim "чистым", но метод не получается, поэтому ниже пришелся по масссиву циклом
        System.out.print("Ежемесячные траты ");
        for (int i = 0; i < accountantsBook.length; i++) {
            if (i == accountantsBook.length - 1) {
                System.out.println(accountantsBook[i]);
            } else {
                System.out.print(accountantsBook[i] + ", ");
            }
        }
        System.out.println("Сумма трат за месяц составила " + theSumOfAllExpensesForTheMonth() + " рублей.");
        // Задача 2
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за день составила " + minimumExpensesPerDay() + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maximumExpensesPerDay() + " рублей.");
        // Задача 3
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила " + average() + " рублей.");
        // Задача 4.
        System.out.println("Задача 4");
        System.out.println(correctFullName());
        // Задача 5.
        System.out.println("Задача 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i]= 1;
            matrix[i][matrix.length - i - 1]=1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();


        }
        // Задача 6.
        System.out.println("Задача 6");
        int[] mirrorArray = {5, 4, 3, 2, 1};
        int[] correctArray = new int[5];
        for (int i = 0; i < mirrorArray.length; i++) {
            correctArray[mirrorArray.length - i - 1] = mirrorArray[i];
        }
        System.out.println("До преобразования - " + Arrays.toString(mirrorArray));
        System.out.println("После преобразования с использованием дополнителного массива- " + Arrays.toString(correctArray));

        // Задача 7.
        System.out.println("Задача 7");
        for (int i = 0; i < mirrorArray.length / 2; i++) {
            int tmp = mirrorArray[i];
            mirrorArray[i] = mirrorArray[mirrorArray.length - i - 1];
            mirrorArray[mirrorArray.length - i - 1] = tmp;
        }
        System.out.println("После преобразования без использования дополнительного массива - " + Arrays.toString(mirrorArray));

        // Задача 8.
        System.out.println("Задача 8");

        int[] numbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int j = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + numbers[j] == -2) {
                if (numbers[i] + numbers[j] == -2) {
                    System.out.println("Сумма чисел " + numbers[i] + " и " + numbers[j] + " будет равна -2");
                    j++;
                }
            }
        }
        // Задача 9.
        System.out.println("Задача 9");
        for (int i = 0; i < numbers.length; i++) {
            for (int n = i + 1; n < numbers.length; n++) {
                if (n != i && (numbers[n] + numbers[i]) == -2) {
                    System.out.println("Сумма чисел " + numbers[i] + " и " + numbers[n] + " будет равна -2");
                }
            }
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

    public static int theSumOfAllExpensesForTheMonth() {

        int sum = accountantsBook[0];
        for (int i = 0; i < accountantsBook.length; i++) {
            sum = sum + accountantsBook[i];
        }
        return sum;
    }

    public static int maximumExpensesPerDay() {
        int minPossibleWaste = 0;
        int max = minPossibleWaste;
        for (int i = 0; i < accountantsBook.length; i++) {
            if (accountantsBook[i] > max) {
                max = accountantsBook[i];
            }
        }
        return max;
    }

    public static int minimumExpensesPerDay() {
        int min = accountantsBook[0];
        for (int i = 0; i < accountantsBook.length; i++) {
            if (accountantsBook[i] < min) {
                min = accountantsBook[i];
            }
        }
        return min;
    }

    public static double average() {
        int numberOfDays = accountantsBook.length;// стоит ли вводить новую переменную, только для красоты?
        return (double) theSumOfAllExpensesForTheMonth() / numberOfDays;
    }

    public static char[] correctFullName() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;

        }
        return reverseFullName;
    }
}






