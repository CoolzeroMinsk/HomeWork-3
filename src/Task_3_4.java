import java.util.Scanner;

public class Task_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
/*
Задаём условие вывода падежа
 */
        if (number == 0 )
            System.out.println("Введённое число " + number + " рублей");
        else if (number ==1)
            System.out.println("Введённое число " + number + " рубль");
        else if (number > 1 && number < 5 )
            System.out.println("Введённое число " + number + " рубля");
        else if (number > 5 && number <=20)
            System.out.println("Введённое число " + number + " рублей");
    }
}
