package calculator;

/**
 * класс калькулятор с логированием
 * применяется паттерн Декоратор, который содержит
 * объект обычный калькулятор
 * и объект логер
 * через интерфейсы
 */
public class DecLogCalc implements iCalculable{
    private iCalculable decorated;///< объект типа калькулятор от интерфейса iCalculable
    private iLoggable logger;///< объект типа логер от интерфейса iLoggable

    /**
     * конструктор
     * @param decorated
     * @param logger
     */
    public DecLogCalc(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }
    /**
     * метод сложения
     * @param arg операнд сложения
     * @return сумму, прибавляет операнд к имеющемуся значению
     */
    @Override
    public iCalculable sum(int arg) {
        int firstAgr = decorated.getResult();
        logger.log(String.format("первое значение калькулятора %d. Начало вызова метода sum", firstAgr));
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("вызов метода sum произошел"));
        return result;
    }

    /**
     * метод умножения
     * @param arg операнд умножения
     * @return произведение операнда с имеющимся значением
     */
    @Override
    public iCalculable multi(int arg) {
        int firstAgr = decorated.getResult();
        logger.log(String.format("первое значение калькулятора %d. Начало вызова метода multi", firstAgr));
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("вызов метода multi произошел"));
        return result;
    }

    /**
     * метод возвращает результат вычислений
     * @return результат операции
     */
    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("получение результата %d", result));
        return result;
    }

    /**
     * метод деления
     * @param arg операнд делитель
     * @return результат деления имеющегося значения на операнд делитель
     */
    @Override
    public iCalculable divide(int arg) {
        int firstAgr = decorated.getResult();
        logger.log(String.format("первое значение калькулятора %d. Начало вызова метода divide", firstAgr));
        iCalculable result = decorated.divide(arg);
        logger.log(String.format("вызов метода divide произошел"));
        return result;
    }


}
