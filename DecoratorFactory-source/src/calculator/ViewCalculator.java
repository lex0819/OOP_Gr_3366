package calculator;

import java.util.Scanner;

/**
 * класс служит для взаимодействия с пользователем через консоль
 */
public class ViewCalculator {

    private ICalculableFactory calculableFactory; ///< объект типа ICalculableFactory

    /**
     * конструктор
     * @param calculableFactory содержит объект типа ICalculableFactory
     */
    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    /**
     * метод содержит логику взаимодействия с пользователем
     * через консоль
     */
    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.divide(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * @param message строка, которую пользователь вводит в консоле
     * @return введенную пользователем строку в консоли
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * @param message строка с числом, которую пользователь вводит с консоли
     * @return введенное пользователем число
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
