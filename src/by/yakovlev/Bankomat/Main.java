package by.yakovlev.Bankomat;

import java.util.Arrays;
import java.util.Scanner;

import static by.yakovlev.Bankomat.Storage.array;


public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        Bankomat bankomat = new Bankomat();
        Functional option = new Functional();
        Banknote[] bankNote = new Banknote[0];
        while (isRunning) {
            System.out.println("Выберите операцию");
            System.out.println("Проверить баланс счёта [C]; Пополнить баланс [A]; Снять сумму денег [G] или Закончить работу[E]");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            switch (command) {
                case "C": {
                    System.out.println("Ваш баланс составляет");
                    option.checkBalance(array);
                    System.out.println(option.checkBalance(array));
                    break;
                }
                case "A": {
                    System.out.println("Вставьте купюру");
                    int note = scanner.nextInt();
                    if (note == 20) {
                        array[0] += 1;
                        System.out.println("Введено 20 р.");
                    } else if (note == 50) {
                        array[1] += 1;
                        System.out.println("Введено 50 р.");
                    } else if (note == 100) {
                        array[2] += 1;
                        System.out.println("Введено 100 р.");
                    } else {
                        System.out.println("Неверная купюра");

                    }
                    break;
                }


                case "G": {
                    System.out.println("Введите нужную Вам сумму");
                    int moneyNeed = scanner.nextInt();
                    option.moneyExtract(moneyNeed, array);

                }
                case "E": {

                }

                default: {
                    System.out.println("Your command is wrong");
                    break;
                }
            }
        }

        System.out.println("Program exit");
        System.exit(0);
    }

     /*   private static void enterBanknotes(Scanner scanner) {
            do {
                System.out.println("Please insert banknote [5] [10] [20] BYN or [cancel]");
                String bankNotes = scanner.nextLine();
                if ("cancel".equals(bankNotes)) break;

                int bankNoteAmount = 0;
                switch (bankNotes) {
                    case "5":
                        bankNoteAmount = 5;
                        break;
                    case "10":
                        bankNoteAmount = 10;
                        break;
                    case "20":
                        bankNoteAmount = 20;
                        break;
                }
                if (bankNoteAmount == 0) {
                    System.out.println("Please insert money again");
                } else {
                    machine.acceptBankNote(new Banknote.Banknote(bankNoteAmount, "BYN"));
                }
            } while (true);
        }*/
}

