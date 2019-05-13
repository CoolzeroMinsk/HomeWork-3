package ArrayList_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class ArrayList_26 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>(10);//Создаем коллекцию с 10-ью элементами

        for (int i = 0; i < 10; i++) {                          //заполняем случайными числами
            int x = ((int) (Math.round(Math.random() * 10)));
            arrayList.add(i, x);
        }
        System.out.println(Arrays.asList("Наша коллекция имеет вид:" + arrayList));    //выводим получившийся результат

        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext(); ) {//Пробегаем итератором
            Integer integer = iterator.next();                                             //по нашей коллекции
            if (integer <= 3) {                                                        //и убираем из неЁ элементы
                iterator.remove();                                                     //меньше "тройки"
            }
        }
        System.out.println("Список без плохих оценок выглядит следующим образом:" + Arrays.asList(arrayList));                                //Выводим получившийся результат
    }
}



