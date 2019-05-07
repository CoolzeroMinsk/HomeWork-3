package by.yakovlev.Bankomat;

class Functional {


    public void checkBanknote() {


    }

    public boolean moneyExtract(int moneyNeed, int[] array) {
        boolean isSuccess = false;
        if (moneyNeed > checkBalance(array)) {
            // add code
            System.out.println("Недостаточно средств в банкомате");
        } else {
            System.out.println("Возьмите деньги: " + moneyNeed + " рублей");
            if (moneyNeed >= 100) {
                int count100 = moneyNeed % 100;
                int available100 = array[2];
                if (available100 == 0) {
                    //смотрим нужную сумму более мелкими купюрами.
                }

                if (available100 >= count100) {
                    System.out.println("Выдано: " + count100 + " купюр по 100 рублей.");
                    //смотрим нужную сумму более мелкими купюрами.
                } else { // available100 < count100
                    System.out.println("Выдано: " + available100 + " купюр по 100 рублей.");
                    //смотрим нужную сумму более мелкими купюрами.
                }

                isSuccess = true;
            }
        }
        return isSuccess;
    }

    public int checkBalance(int[] array) {
        int sum = 0;
        if (array[0] != 0) {
            sum += array[0] * 20;
        }
        if (array[1] != 0) {
            sum += array[1] * 50;
        }
        if (array[2] != 0) {
            sum += array[2] * 100;
        }

        return sum;
    }
}