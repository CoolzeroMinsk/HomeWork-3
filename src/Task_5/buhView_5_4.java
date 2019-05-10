package Task_5;

import java.util.Scanner;

public class buhView_5_4 {
    public static void main(String[] args) {
        System.out.println("Введите число для расчёта");
        Scanner scanner = new Scanner(System.in); //
        int num = scanner.nextInt();              //вводим число

        Integer.toString(num);                    //
        String str = Integer.toString(num);       //преобразуем число в строку
        System.out.println(str);                  //

        int x = str.length();                                       //
        for (int i = 3;i < x;i+=3){                                 //
        String before = str.substring(0, i+(i/3-1));                //цикл добавляет в строку пробелы, путём разрезания её
        String after = str.substring(i + (i /3-1), str.length());   //и склеивая с пробелами
        str = before + " " + after;                                 //
        }
        System.out.println(str);                //выводим на экран число с пробелами
    }
}
