package generator;

/**
 * класс фабрика, генерирует продукт GoldProduct
 * генератор продукта GoldProduct
 */
public class GoldFactory extends AbstractFactory {
    /**
     * @return создает объект с типом интерфейса iGameItem
     * возвращает продукт класса GoldProduct
     */
    @Override
    public iOpenFactory createProduct() {
        return new GoldProduct();
    }
}
