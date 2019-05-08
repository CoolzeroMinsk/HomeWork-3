package task_21.TwoCircles;
//Проверяем работу StringBuffer'a

public class ThirdClass {
        public static void main(String[] args) {

        String bartSaid = "Eat my short's, Man !";
        String homerSaid = "I'm gonna kick you !";
        StringBuffer stringBuffer = new StringBuffer(bartSaid);

        /*stringBuilder.append(manSaid);
        System.out.println(stringBuilder);*/

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println();
                stringBuffer.append(bartSaid);
                System.out.println(bartSaid);
            }else {
                System.out.println();
                stringBuffer.append(homerSaid);
                System.out.println(homerSaid);
            }
        }
        System.out.println("HAPPY END");
    }
    }


