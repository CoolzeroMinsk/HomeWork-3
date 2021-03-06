import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class TaskPaperBook_18 {
    public static void main(String[] args) {
        //вводим текст для поиска знаков препинания
        String taskString = "Скоро весь сад, согретый солнцем, обласканный, ожил, и капли росы, как алмазы, засверкали на листьях; и старый, давно запущенный сад в это утро казался таким молодым, нарядным ";
        Pattern pattern = Pattern.compile("[!.,;:?\\-]"); //создаем шаблон поиска символов
        Matcher matcher = pattern.matcher(taskString);    //передаем текст для поиска соответствий шаблону

        int count = 0;                                    //
        while (matcher.find()) {                          //добавляем цикл поиска знаков препинания
            count++;                                      //
        }
        System.out.println(count);                        //выводим на экран получившееся количество знаков
    }
}
