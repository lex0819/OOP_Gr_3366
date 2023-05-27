package complex;

/**
 * класс создаёт новый объект типа ComplexCalculator
 * фабрика по производству калькуляторов комплексных чисел
 * с инициированным начальным операндом
 */
public class ComplexCalcFactory implements IComplexCalcFactory {

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return объект класса ComplexCalculator
     */
    @Override
    public iComplexCalc create(double argRe, double argIm) {
        return new ComplexCalc(argRe, argIm);
    }
}
