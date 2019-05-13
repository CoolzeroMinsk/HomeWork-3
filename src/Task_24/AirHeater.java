package Task_24;

public class AirHeater extends KeroseneLamp implements IPlugInSocket, IInterfaceOfAirHeaters, IdeplugSocket {
    public static void airHeater(String[] args) {

    }
    @Override
    public void plugInSocket() {
        System.out.println("Вставляем штепсель электрообогревателя в розетку.");

    }

    @Override
    public void turnOn() {
        System.out.println("Включаем обогреватель, нажав на кнопку.");

    }

    @Override
    public void tempUp() {
        super.tempUp();
    }



    @Override
    public void turnOff() {
        System.out.println("Выключаем обогреватель вновь нажав на кнопку.");
    }

    @Override
    public void deplugSocket() {
        System.out.println("Выдёргиваем штепсель из розетки.");
    }
}
