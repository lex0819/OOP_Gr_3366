package engine;

/**
 * класс содержит метод заправки автомобиля дизелем
 */
public class DieselEngine implements FuelEngine{
    /**
     * метод заправки автомобиля дизелем
     */
    @Override
    public void start() {
        System.out.println("Full tank of diesel");
    }
}
