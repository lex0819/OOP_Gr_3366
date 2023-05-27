package generator;

/**
 * класс фабрика, генерирует продукт BubbleProduct
 * генератор продукта BubbleProduct
 */
public class BubbleFactory extends AbstractFactory {
    /**
     * @return создает объект с типом интерфейса iOpenFactory
     * возвращает продукт класса BubbleProduct
     */
    @Override
    public iOpenFactory createProduct() {
        return new BubbleProduct();
    }
}
