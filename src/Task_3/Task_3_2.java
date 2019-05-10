package Task_3;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Реализуем сканер ввода данных
    int inputNumber = sc.nextInt(); //заносим введённые данные в переменную int
        System.out.println("Вы ввели число = " + inputNumber);
    if ((inputNumber % 10) == 7)//сравниваем введенное число с семёркой
        System.out.println("Это число является семёркой" );
    else
        System.out.println("Последняя цифра не является семёркой");


    }
}
