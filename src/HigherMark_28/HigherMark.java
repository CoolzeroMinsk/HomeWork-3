package HigherMark_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class HigherMark {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);//Создаем коллекцию с 10-ью элементами

        for (int i = 0; i < 10; i++) {                          //заполняем случайными числами
            int x = ((int) (Math.round(Math.random() * 10)));
            arrayList.add(i, x);

        }
        System.out.println(Arrays.asList("Наша коллекция имеет вид:" + arrayList));    //выводим получившийся результат

        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integer < Collections.max(arrayList)) {
                iterator.remove();
            }
        }
        System.out.println("Самая высокая оценка в списке:" + Arrays.asList(arrayList));
    }
}