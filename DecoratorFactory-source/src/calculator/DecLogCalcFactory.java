package calculator;

/**
 * класс создаёт новый объект типа DecLogCalc
 * фабрика по производству калькуляторов с логированием
 * с инициированным начальным операндом
 */
public class DecLogCalcFactory implements ICalculableFactory {
    private iLoggable logger;///< объект типа iLoggable

    /**
     * конструктор
     * @param logger объект типа iLoggable
     */
    public DecLogCalcFactory(iLoggable logger){
        this.logger = logger;
    }

    /**
     * метод создает логированный калькулятор
     * @param primaryArg первоначальный операнд
     * @return объект типа DecLogCalc логированный калькулятор
     */
    public iCalculable create(int primaryArg) {
        return new DecLogCalc( new Calculator(primaryArg), logger);
    }
}
