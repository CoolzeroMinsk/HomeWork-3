import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskPaperBook_19 {
    public static void main(String[] args) {
        String text = " Каждый охотник желает знать где сидит фазан и бегемот. ";   //строка для подсчёта слов
        String text2 = text.trim(); //возврат строки с удаленными начальными и конечными пробелами

        int words = text2.isEmpty() ? 0 : text2.split("\\s+").length;  //тернарный оператор с условием, выводящем количество слов
                                                                             //путём разбивания введённого текста на слова вокруг непробельных символов, тоесть слов.
        System.out.println(words);

    }
}
