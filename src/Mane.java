import java.util.Arrays;

import static java.lang.System.*;

public class Mane {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задача № 1 Сумма
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int expence : arr) {
            sum += expence;
        }
        System.out.println("Сумма затрат затрат за месяц составила " + sum + " рублей.");
        // Задача № 2 Вилка затрат
        int maxMeaning = 99_999;
        int minMtaning = 200_001;
        for (int expenses : arr) {
            if (expenses > maxMeaning) {
                maxMeaning = expenses;
            }
            if (expenses < minMtaning) {
                minMtaning = expenses;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMtaning + " рублей. Максимальная сумма трат за день составила " + maxMeaning + " рублей.");
    // Задача № 3 Средняя сумма трат за ммесяц
        for (int j : arr) {
            double averageCost = (sum += j) / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей.");
            break;
        }
    // Задача № 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            out.print(reverseFullName[i]);
        }   
    }
}

