package Task_5;

import java.util.Scanner;

public class SumOfNumbers_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для расчёта суммы");
        int number = scanner.nextInt();
        int sumNumber = 0;
        for (int i = 1; i <= number; i++) {
            sumNumber += i;

        }
        System.out.println("Сумма всех чисел числа " + number + " равна " + sumNumber);
    }
}
