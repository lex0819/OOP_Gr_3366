package calculator;

/**
 * класс создаёт новый объект типа Calculator
 * фабрика по производству обычных калькуляторов
 * с инициированным начальным операндом
 */
public class CalculableFactory implements ICalculableFactory {
    /**
     * @param primaryArg первоначальный операнд
     * @return объект класса калькулятор
     */
    public iCalculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
