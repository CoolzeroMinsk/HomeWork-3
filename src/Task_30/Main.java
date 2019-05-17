package Task_30;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Создаём файл
        File file = new File("filename.txt");

        //Записываем в него информацию
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("filename.txt"), "utf-8"))) {
            writer.write("Текст (от лат. textus - ткань; сплетение, сочетание) - зафиксированная на либом материальном" +
                    " носителе человеческая мысль, в общем плане " + "связная и полная последовательность символов.");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Читаем содержимое и выводим на экран
        try (BufferedReader reader = new BufferedReader(new FileReader("filename.txt"))) {
            System.out.println("Читаем файл :\n" + reader.readLine());
            String text = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Создаем объект reader для поиска им слов и знаков препинания.
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
/**/
            String text = reader.readLine();
            String text2 = text.trim();
            int words = text2.isEmpty() ? 0 : text2.split("\\s+").length;
            System.out.println("Количество слов : " + words);
            Pattern pattern = Pattern.compile("[!.,;:?\\-]"); //создаем шаблон поиска символов
            Matcher matcher = pattern.matcher(text2);    //передаем текст для поиска соответствий шаблону

            int symbol = 0;                                    //
            while (matcher.find()) {                          //добавляем цикл поиска знаков препинания
                symbol++;                                      //
            }
            System.out.println("Количество знаков препинания: " + symbol);                        //выводим на экран получившееся количество знаков


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
