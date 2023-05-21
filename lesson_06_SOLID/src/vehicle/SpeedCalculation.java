package vehicle;

/**
 * интерфейс содержит функцию, вычисляющую
 * максимально разрешенную скорость транспортного средства
 */
public interface SpeedCalculation {
    /**
     * @return максимально разрешенная скорость
     */
    public double calculateAllowedSpeed();
}