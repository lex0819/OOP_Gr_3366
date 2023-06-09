package calculator;

/**
 * интерфейс предоставляет функции для действий над двумя операндами
 * сложение, умножение, деление
 */
public interface iCalculable {
    /**
     * метод сложения
     * @param arg операнд сложения
     * @return сумму, прибавляет операнд к имеющемуся значению
     */
    iCalculable sum(int arg);

    /**
     * метод умножения
     * @param arg операнд умножения
     * @return произведение операнда с имеющимся значением
     */
    iCalculable multi(int arg);

    /**
     * метод возвращает результат вычислений
     * @return результат операции
     */
    int getResult();

    /**
     * метод деления
     * @param arg операнд делитель
     * @return результат деления имеющегося значения на операнд делитель
     */
    iCalculable divide(int arg);

}
