import java.util.Scanner;

public class SImpleNumber_5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для расчёта");
        double number = scan.nextDouble();


        if ((number % number == 0) && (number % 1 == 0)){
            System.out.println("Введённое число " + number + " является простым ");
        } else {
            System.out.println("Введённое число " + number + " не является простым ");
        }
    }
}
