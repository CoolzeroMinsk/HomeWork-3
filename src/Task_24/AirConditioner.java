package Task_24;

public class AirConditioner extends AirHeater implements IInterfaceOfAirHeaters, IPlugInSocket, IdeplugSocket, Ifreezing{
    @Override
    public void plugInSocket() {
        super.plugInSocket();
    }

    @Override
    public void turnOn() {
        System.out.println("Включаем кондиционер воздуха при помощи пульта ");
    }

    @Override
    public void tempUp() {
        super.tempUp();
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем кондиционер, используя пульт управления");
    }

    @Override
    public void deplugSocket() {
        super.deplugSocket();
    }

    @Override
    public void freezTheRoom() {
        System.out.println("Понижаем температуру до состояния \"Прохладно\".");
    }

    public void airCondtitioner(String[] args){


    }
}
