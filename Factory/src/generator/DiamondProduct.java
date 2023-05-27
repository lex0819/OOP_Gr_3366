package generator;

/**
 * класс product Бриллианты
 * это продукт, который генерирует фабрика DiamondGenerator
 */
public class DiamondProduct implements iOpenFactory {
    /**
     *
     */
    @Override
    public void open() {
        System.out.println("Diamond!");
    }
}
