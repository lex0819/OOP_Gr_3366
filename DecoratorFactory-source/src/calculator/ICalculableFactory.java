package calculator;

/**
 * интерфейс предоставляет фабричную функцию создания цепочки действий над операндом
 */
public interface ICalculableFactory {
    /**
     * @param primaryArg первоначальный операнд
     * @return объект типа iCalculable с начальным операндом
     */
    iCalculable create(int primaryArg);
}
