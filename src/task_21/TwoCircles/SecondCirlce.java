package task_21.TwoCircles;
//Проверяем работу String и оператора сложения
public class SecondCirlce {
    public static void main(String[] args) {

        String bartSaid = "Eat my short's, Man !";
        String homerSaid = "I'm gonna kick you !";
        String temp;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println();
                temp = bartSaid + homerSaid;
                System.out.println(temp);
            } else {
                System.out.println();
                temp = homerSaid + bartSaid;
                System.out.println(temp);
            }
        }
        System.out.println("HAPPY END");
    }
}
