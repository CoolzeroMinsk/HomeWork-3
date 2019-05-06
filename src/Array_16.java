import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_16 {
    public static void main(String[] args) {
        int[] arrX = new int[10];                           //
        for (int i = 0; i < arrX.length; i++) {             //создаём и заполняем массив
            arrX[i] = (int) Math.round(100 * Math.random());//
        }
        System.out.println(Arrays.toString(arrX));          //выводим получившейся массив в консоль


        for (int i = 0; i < arrX.length / 2; i++) {         //
            int tmp = arrX[i];                              //меняем числа в массиве местами
            arrX[i] = arrX[arrX.length - i - 1];            //
            arrX[arrX.length - i - 1] = tmp;                //
        }
        System.out.println(Arrays.toString(arrX));          //выводим массив в обратном направлении
    }
}