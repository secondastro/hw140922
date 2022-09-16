import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        tasks();
        tasksHard();
    }

    public static void tasks() {
        System.out.println("Задачи 1,2,3");
        int[] arr = generateRandomArray();
        int sum = Arrays.stream(arr).sum();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        double avg = sum * (1.0) / arr.length;
        String s = String.format("%.2f", avg);
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + s + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int a = reverseFullName.length;
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[a - 1 - i]);
        }
        System.out.println();
    }

    public static void tasksHard() {
        System.out.println("Задачи повышенной сложности");
        System.out.println("Задача 5");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Задача 6");
        int[] arr1 = {5, 4, 3, 2, 1};
        //int [] arr2 = arr1.clone();
        //System.out.println(Arrays.toString(Arrays.sort(arr2))); не получилось((
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2.length + 1 - arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Задача 7");
        int x = 0;
        for (int i = 0; i < arr1.length / 2; i++) {
            x = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = x;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Задача 8-9");
        int[] arrTask8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arrTask8.length; i++) {
            for (int j = 0; j < arrTask8.length; j++) {
                if (i != j) {
                    if (arrTask8[i] + arrTask8[j] == -2) {
                        System.out.print(arrTask8[i] + " " + arrTask8[j] + "\n");

                    }
                }
            }
        }
    }

    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}