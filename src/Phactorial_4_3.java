import java.util.Scanner;

public class Phactorial_4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для расчета");
        int number = scan.nextInt();
       int f =  phactorialCount(number);
        System.out.println(f);
    }

    private static int phactorialCount(int number) {
        int total = 0;
        int result = 1;
        for (int i = number; i == 1; --i) {
            result *= number;
            total += result;
        }

        return total;
    }
}
