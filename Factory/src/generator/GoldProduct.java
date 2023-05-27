package generator;

/**
 * класс product Золотые монеты
 * это продукт, который генерирует фабрика GoldGenerator
 */
public class GoldProduct implements iOpenFactory {
    /**
     *
     */
    @Override
    public void open() {
        System.out.println("Golden coin");
    }
}
