package engine;

/**
 * класс автомобиль
 */
public class Auto {
    private FuelEngine engine;//< объект типа топливо

    /**
     * конструктор
     * @param engine объект типа топливо
     */
    public Auto(FuelEngine engine) {
        this.engine = engine;
    }

    /**
     * метод заправки автомобиля топливом
     */
    public void start() {
        this.engine.start();
    }
}
