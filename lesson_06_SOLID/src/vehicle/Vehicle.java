/*
* 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
* Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
*/

package vehicle;

/**
 * базовый класс машина - транспортное средство
 */
public class Vehicle {
    int maxSpeed;
    String type;

    /**
     * конструктор
     * @param maxSpeed максимальная скорость
     * @param type типа машины
     */
    public Vehicle(int maxSpeed, String type ) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * @return максимальная скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * @return типа машины
     */
    public String getType() {
        return this.type;
    }
}