package complex;

/**
 * класс калькулятор  комплексных чисел с логированием
 * применяется паттерн Декоратор, который содержит
 * объект калькулятор комплексных чисел
 * и объект логер
 * через интерфейсы
 */
public class DecLogComplexCalc implements iComplexCalc{
    private iComplexCalc decorated;///< объект типа калькулятор от интерфейса iComplexCalc
    private iLoggable logger;///< объект типа логер от интерфейса iLoggable

    /**
     * конструктор
     * @param decorated объект типа калькулятор от интерфейса iComplexCalc
     * @param logger объект типа логер от интерфейса iLoggable
     */
    public DecLogComplexCalc(iComplexCalc decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return сумму операнда с уже накопленным значением
     */
    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода sum"));
        logger.log(String.format("вещественная часть первого значения калькулятора %f.", firstAgrRe));
        logger.log(String.format("мнимая часть первого значения калькулятора %f.", firstAgrIm));
        iComplexCalc result = decorated.sum(argRe, argIm);
        logger.log(String.format("вызов метода sum произошел"));
        return result;
    }

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return произведение операнда с уже накопленным значением
     */
   @Override
    public iComplexCalc multi(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода multi"));
        logger.log(String.format("вещественная часть первого значения калькулятора %f.", firstAgrRe));
        logger.log(String.format("мнимая часть первого значения калькулятора %f.", firstAgrIm));
        iComplexCalc result = decorated.multi(argRe, argIm);
        logger.log(String.format("вызов метода multi произошел"));
        return result;
    }

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return результат деления имеющегося значения на операнд делитель
     */
    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода divide"));
        logger.log(String.format("вещественная часть первого значения калькулятора %f.", firstAgrRe));
        logger.log(String.format("мнимая часть первого значения калькулятора %f.", firstAgrIm));
        iComplexCalc result = decorated.divide(argRe, argIm);
        logger.log(String.format("вызов метода divide произошел"));
        return result;
    }

    /**
     * @return результат деления имеющегося значения на операнд делитель
     */
    @Override
    public String getResult() {
        String result = decorated.getResult();
        logger.log(String.format("получение результата %s", result));
        return result;
    }

    /**
     * @return вещественную часть результата операции над комплексными числами
     */
    @Override
    public double getRe() {
        double result = decorated.getRe();
        logger.log(String.format("получение вещественной части результата %f", result));
        return result;
    }

    /**
     * @return мнимую часть результата операции над комплексными числами
     */
    @Override
    public double getIm() {
        double result = decorated.getIm();
        logger.log(String.format("получение мнимой части результата %f", result));
        return result;
    }
}
