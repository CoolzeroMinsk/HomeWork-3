import java.util.Arrays;

public class ArraySummOfNumbers_5_5 {
    public static void main(String[] args) {
        //заполняем массив
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Наш массив имеет вид " + Arrays.toString(array));

        //находим минимальное число
        int min = array[0];
        for (int x : array) {
            if (x < min)
                min = x;
        }
        System.out.println("Минимальное число: " + min);

        //находим максимальное число
        int max = array[0];
        for (int x : array) {
            if (x > max)
                max = x;
        }
        System.out.println("Максимальное число: " + max);

        //расчитываем сумму между минимумом и максимумом
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        //выводим на экран
        System.out.println("Сумма элементов массива между минимальным и максимальным значениями = " + (sum - (min + max)));

    }
}

