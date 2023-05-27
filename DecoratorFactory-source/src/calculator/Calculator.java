package calculator;

/**
 * класс обычный калькулятор
 */
public final class Calculator implements iCalculable {

    private int primaryArg;///< операнд для вычислений

    /**
     * конструктор обычного калькулятора
     * @param primaryArg операнд для вычислений
     */
    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * @param arg операнд сложения
     * @return сумму операнда с уже накопленным значением
     */
    @Override
    public iCalculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    /**
     * @param arg @param arg операнд умножения
     * @return произведение операнда с уже накопленным значением
     */
    @Override
    public iCalculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    /**
     * @return результат вычислений
     */
    @Override
    public int getResult() {
        return primaryArg;
    }

    /**
     * @param arg операнд делитель
     * @return результат деления имеющегося значения на операнд делитель
     */
    @Override
    public iCalculable divide(int arg) {
        primaryArg = primaryArg / arg;
        return this;
    }
}
