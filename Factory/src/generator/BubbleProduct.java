package generator;

/**
 * класс product Пузыри
 * это продукт, который генерирует фабрика DiamondGenerator
 */
public class BubbleProduct implements iOpenFactory {
    /**
     *
     */
    @Override
    public void open() {
        System.out.println("Bubble gum");
    }
}
