package Task_4;

import java.util.Scanner;

public class Factorial_4_3 {
    public static void main(String[] args) {                //
        Scanner scan = new Scanner(System.in);              //
        System.out.println("Введите число для расчета");    //Вводим число с клавиатуры
        int number = scan.nextInt();                        //
        System.out.println(factorialCount(number));         //
    }

    private static int factorialCount(int number) { //код расчёта факториала
        int total = 1;
        for (int i = 1; i <= number;i++ ){
            total *= i;

        }
        return total;
    }
}