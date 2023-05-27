package generator;

/**
 * абстрактный класс фабрика, для реальных фабрик-генераторов
 * генератор сундучков с монетками, камушками и тд в игре
 */
public abstract class AbstractFactory {
    /**
     * метод открывает сундучок
     */
    public void openFactory(){
        iOpenFactory gameItem = createProduct();
        gameItem.open();
    };

    /**
     * @return создает объект типа iGameItem
     */
    public abstract iOpenFactory createProduct();
}
