import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //реализуем сканер
        int a = sc.nextInt();                //
        int b = sc.nextInt();                //
        int r = sc.nextInt();                //объявляем переменные, введённые из сканера
        double rectangle;                    //
        double circle;                       //

        rectangle = a * b;                  //расчет площади прямоугольника
        circle = 3.14*(r*r);                //расчет площади круга

        if (rectangle > circle)             //задаем условие проверки площадей
            System.out.println("Размер вашей картонки недостаточен, возьмите другую");
        else
            System.out.println("Картонка подошла, поздравляем !");

    }
}
