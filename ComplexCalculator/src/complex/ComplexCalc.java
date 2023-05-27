package complex;

/**
 * класс калькулятор комплексных чисел
 * продукт фабрики ComplexCalcFactory
 */
public final class ComplexCalc implements iComplexCalc {

    private double primaryArgRe;///< комплексный операнд для вычислений re часть
    private double primaryArgIm;///< комплексный операнд для вычислений im часть

    /**
     * конструктор
     * @param primaryArgRe комплексный операнд для вычислений re часть
     * @param primaryArgIm комплексный операнд для вычислений im часть
     */
    public ComplexCalc(double primaryArgRe, double primaryArgIm) {

        this.primaryArgRe = primaryArgRe;
        this.primaryArgIm = primaryArgIm;
    }

    /**
     * @param argRe операнд сложения вещественная часть
     * @param argIm операнд сложения мнимая часть
     * @return сумму операнда с уже накопленным значением
     */
    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        primaryArgRe += argRe;
        primaryArgIm += argIm;
        return this;
    }

    /**
     * @param argRe операнд умножения вещественная часть
     * @param argIm операнд умножения мнимая часть
     * @return произведение операнда с уже накопленным значением
     */
    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        primaryArgRe = primaryArgRe *  argRe - primaryArgIm * argIm;
        primaryArgIm = primaryArgIm * argRe + primaryArgRe * argIm;
        return this;
    }

    /**
     * @param argRe операнд делитель вещественная часть
     * @param argIm операнд делитель мнимая часть
     * @return результат деления имеющегося значения на операнд делитель
     */
    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        primaryArgRe = (primaryArgRe *  argRe + primaryArgIm * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        primaryArgIm = (primaryArgIm * argRe - primaryArgRe * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        return this;
    }

    /**
     * @returnc
     */
    @Override
    public String getResult() {
        String operator = primaryArgIm >= 0 ? "+": "";
        return primaryArgRe + operator + primaryArgIm + "*i";
    }

    /**
     * @return вещественную часть результата операции над комплексными числами
     */
    @Override
    public double getRe() {
        return primaryArgRe;
    }

    /**
     * @return мнимую часть результата операции над комплексными числами
     */
    @Override
    public double getIm() {
        return primaryArgIm;
    }
}
