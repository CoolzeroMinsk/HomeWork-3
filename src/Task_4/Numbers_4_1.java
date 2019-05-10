package Task_4;

import java.util.Scanner;

public class Numbers_4_1 {
    public static void main(String[] args) {
        doWork();
    }

    private static void doWork() {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        int day = Integer.parseInt(a);
        int month = Integer.parseInt(b);
        int year = Integer.parseInt(c);
                                                                //блок проверок
        boolean isDayValid = day > 0 && day < 31;               //дней
        boolean isMonthValid = month > 0 && month < 12;         //месяцев
        boolean isYearValid = year > 0;                         //лет
                                                                //
        if (!isDayValid || !isMonthValid || !isYearValid) {
            System.out.println("Вы ввели некорректную дату");
        } else {
            day += 1;

            if (day == 31) {
                month += 1;
                day = 1;
            }

            if (month == 12) {
                year++;
            }

            System.out.println(day + "." + month + "." + year);
        }
    }
}
