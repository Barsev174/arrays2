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


    }


    // вроде нет в условии, что мы должны вывести траты за каждый день, но вывести то хочется)
    /* public static void spendingPerDay () {   // не поимаю какие модификаторы нужны, и какую переменную поставить. Склоняюсь к String, но реализовать не получаетя
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        return;// не могу понять, что мы должны возвращать
    } */

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int theSumOfAllExpensesForTheMonth() {
        int minPossibleAmount = 0;
        int sum = minPossibleAmount;
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
        int maxPossibleWaste = 200_000; // магическое число, но не знаю, как написать иначе
        int min = maxPossibleWaste;
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






