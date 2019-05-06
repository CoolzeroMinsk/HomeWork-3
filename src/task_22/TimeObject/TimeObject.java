package task_22.TimeObject;

public class TimeObject {

    int sec = 0;        //создаём
    int min = 0;        //переменные
    int hour = 0;       //класса


    public TimeObject(int sec) {   //конструктор, принимающий на входе общее кол-во секунд
        this.sec = sec;
    }

    public TimeObject(int sec, int min, int hour) { //конструктор, принимающий на вход секунды, минуты и часы соответственно
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }


    public static void main(String[] args) {
        TimeObject dayLength = new TimeObject(0, 0, 24);    //создаём 3 объекта типа TimeObject
        TimeObject partOfDay = new TimeObject (400);                  //и заносим их ссылки
        TimeObject someTime = new TimeObject(200, 150, 20); //в переменные


        System.out.println("В нашем объекте dayLength " + dayLength.objectSecCalculate() + "секунда"); //выводим количество
        System.out.println("В нашем объекте partOfDay " + partOfDay.objectSecCalculate() + "секунд"); //секунд в наших объектах
        System.out.println("В нашем объекте someTime " + someTime.objectSecCalculate() + "секунд");   //используя метод objectCalculate()



        System.out.println("Сравниваем объекты: dayLength и partOfDay. Результат - " + dayLength.equals(partOfDay)); //сравниваем объекты
        System.out.println("Сравниваем объекты: dayLength и someTime. Результат - " + dayLength.equals(someTime));   //используя метод
        System.out.println("Сравниваем объекты: partOfDay и someTime. Результат - " + partOfDay.equals(someTime));   //equals()

    }


    int objectSecCalculate (){      //метод расчёта общего количества секунд в объекте
        int objectSeconds = sec + (min * 60) + (hour * 3600);
        return objectSeconds;
    }


}

