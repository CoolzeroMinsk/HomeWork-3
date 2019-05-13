package Task_24;

public class KeroseneLamp implements IInterfaceOfAirHeaters, ILightIsOn {
    public static void keroseneLamp(String[] args) {

    }

    @Override
    public void turnOn() {
        System.out.println("Лампа разжигается с помощью открытого огня. ");
        // boolean lampOn = true;
    }

    @Override
    public void tempUp() {
        System.out.println("Температра внутри комнаты увеличивается. ");
    }

    @Override
    public void lightOn() {
        System.out.println("Комната освещается пламенем. ");
    }

    @Override
    public void turnOff() {
        System.out.println("Свет огня гаснет. ");
        System.out.println("Температура начинается падать. ");
        System.out.println("Становиться темно.");
    }
}
