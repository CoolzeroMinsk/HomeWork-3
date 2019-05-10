package Task_4;

import java.util.Scanner;

public class Houses_4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //стороны 1-ого дома
        System.out.println("Введите первый параметр дома");
        int a = scan.nextInt();
        System.out.println("Введите второй параметр дома");
        int b = scan.nextInt();

        //стороны 2-ого дома
        System.out.println("Введите первый параметр дома");
        int c = scan.nextInt();
        System.out.println("Введите первый параметр дома");
        int d = scan.nextInt();

        //стороны участка
        System.out.println("Введите первый параметр участка");
        int e = scan.nextInt();
        System.out.println("Введите второй параметр участка");
        int f = scan.nextInt();

        boolean isSquareValid = e * f < ((a * b) + (c * d));//проверка площади
        boolean isWidthValid = (a + c) < e; //проверка ширины
        boolean isHeightValid = (b + d) < f;//проверка длинны


        if ((isWidthValid || isHeightValid) && isSquareValid) {
            System.out.println("Ваш участок подходит для размещения 2-х домов");
        } else {
            System.out.println("Недостаточно свободного места для 2-х домов");
        }

    }
}
