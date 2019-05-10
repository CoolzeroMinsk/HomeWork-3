package Task_3;

public class Task_3_1 {
    public static void main(String[] args) {

        int s = 3700 * 24 * 7 * 8; //добавил врем для лучшего вывода информации
        int sec;
        int m;
        int min, h;
        int hour;
        int day, d;
        int week, w;
        int mo;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;
        week = w % 4;
        mo = (w - week) / 4;

        System.out.println(mo + " месяцев " + w + " недель " + d + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
    }


}
