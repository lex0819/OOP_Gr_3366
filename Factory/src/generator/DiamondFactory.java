package generator;

/**
 * класс фабрика, генерирует продукт DiamondProduct
 * генератор продукта DiamondProduct
 */
public class DiamondFactory extends AbstractFactory {
    /**
     * @return создает объект с типом интерфейса iOpenFactory
     * возвращает продукт класса DiamondProduct
     */
    @Override
    public iOpenFactory createProduct() {
        return new DiamondProduct();
    }
}
