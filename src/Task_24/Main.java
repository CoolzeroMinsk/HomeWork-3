package Task_24;

public class Main {
    public static void main(String[] args) {
        KeroseneLamp kerosene = new KeroseneLamp();
        AirHeater airHeater = new AirHeater();
        AirConditioner airCon = new AirConditioner();

        kerosene.turnOn();
        kerosene.lightOn();
        kerosene.tempUp();
        System.out.println("______________________________________________");
        kerosene.turnOff();
        System.out.println();
        System.out.println();
        System.out.println("Керосиновая лампа закончила свою работу.");
        System.out.println();
        System.out.println();

        airHeater.plugInSocket();
        airHeater.turnOn();
        airHeater.tempUp();
        System.out.println("______________________________________________");
        airHeater.turnOff();
        System.out.println();
        System.out.println();
        System.out.println("Электрообогреватель закончил свою работу.");
        System.out.println();
        System.out.println();

        airCon.plugInSocket();
        airCon.turnOn();
        airCon.tempUp();
        System.out.println("______________________________________________");
        System.out.println(".............<Становится жарко>...............");
        airCon.freezTheRoom();
        System.out.println("...........<Становится комфортно>.............");

        airCon.turnOff();
        airCon.deplugSocket();
        System.out.println("Кондиционер завершил свою работу");
    }
}
