package Task_5;

import java.util.Random;
import java.util.Arrays;

public class maxArrayNumber_5_1 {
    public static void main(String[] args) {
        int maxNumber = 0;

        int[] array = new int[10]; //создаем массив длинной в десять элементов
        for (int i = 0; i < array.length; i++) { //заполняем случайными числами
            array[i] = (int) Math.round(100 * Math.random());
        }
        System.out.println("Наш массив имеет вид " + Arrays.toString(array));
        maxNumber = calculateNumber(array);
        System.out.println("Максимальным числом массива является " + maxNumber);
    }

    private static int calculateNumber(int[] array) { //метод подсчёта максимального числа

        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i])
                maxNumber = array[i];
        }
        return maxNumber;
    }
}