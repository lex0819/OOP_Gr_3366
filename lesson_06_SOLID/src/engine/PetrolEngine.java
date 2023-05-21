package engine;

/**
 * класс содержит метод заправки бензином
 */
public class PetrolEngine implements FuelEngine{
    /**
     * метод заправки автомобиля бензином
     */
    @Override
    public void start() {
        System.out.println("I need some gas");
    }
}
