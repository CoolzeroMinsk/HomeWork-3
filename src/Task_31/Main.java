package Task_31;

import javax.swing.text.html.HTMLDocument;
import java.awt.List;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        File file = new File("file.txt");

        //Создаем тектовый файл с неким содержимым
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("file.txt"), "utf-8"))) {
            writer.write("Текст (от лат. textus - ткань; сплетение, сочетание) - зафиксированная на любом " +
                    "материальном носителе человеческая мысль, в общем плане связная и " +
                    "полная последовательность символов." + " Числа для проверки 1 1 2 2 3 3 4 4 5 5.");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String str = "\"Текст (от лат. textus - ткань; сплетение, сочетание) - зафиксированная на любом \" +\n" +
                "                    \"материальном носителе человеческая мысль, в общем плане связная и \" +\n" +
                "                    \"полная последовательность символов.\" + \" Числа для проверки 1 1 2 2 3 3 4 4 5 5.\"";


//Ищем в нашем тексте цифры при помощи регулярного выражения и печатаем их, переведя в коллекцию
        String str2 = str;
        str = str.replaceAll("\\D+", "");
        int sum = 0;

        char[] numArray = str.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for (char c : numArray) {
            list.add(c);
        }
        System.out.println("Числа в нашем тексте: " + list);


        for (int i = 0; i < numArray.length; i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        System.out.println("Сумма всех чисел в тексте равна: " + sum);


//Создаём коллекцию, типа set, не имеющую в своём составе дубликаты и распечатываем её
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : numArray) {
            charSet.add(c);
        }
        System.out.println("Без повторов наши числа выглядят так: " + charSet);
    }
}



