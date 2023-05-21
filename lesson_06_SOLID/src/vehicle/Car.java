package vehicle;

/**
 * класс Автомобиль
 */
public class Car extends Vehicle implements SpeedCalculation{

    /**
     * @param maxSpeed максимальная скорость автомобиля
     */
    public Car(int maxSpeed){
        super(maxSpeed, "Car");
    }

    /**
     * @return максимально разрешенная скорость автомобиля
     */
    @Override
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.8;
    }
}