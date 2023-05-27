package generator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        /*в списке объекты класса фабрика, наследники абстрактной фабрики*/
        List<AbstractFactory> generatorList = new ArrayList<>();

        /*заполняем список объектами разных фабрик */
        generatorList.add(new GoldFactory());
        generatorList.add(new DiamondFactory());
        generatorList.add(new GoldFactory());
        generatorList.add(new BubbleFactory());
        generatorList.add(new DiamondFactory());
        generatorList.add(new BubbleFactory());
        generatorList.add(new GoldFactory());

        /*в цикле идем по списку и открываем каждую фабрику*/
        /*из нее появляется её продукт*/
        for (AbstractFactory abstractFactory : generatorList) {
            abstractFactory.openFactory();
        }

    }
}