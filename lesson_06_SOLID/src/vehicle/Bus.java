package vehicle;

/**
 * класс Автобус
 */
public class Bus extends Vehicle implements SpeedCalculation{

    /**
     * конструктор
     * @param maxSpeed максимальная скорость автобуса
     */
    public Bus(int maxSpeed){
        super(maxSpeed, "Bus");
    }

    /**
     * @return максимально разрешенная скорость автобуса
     */
    @Override
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.6;
    }
}