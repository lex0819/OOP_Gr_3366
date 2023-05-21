package shape;

/**
 * класс Круг
 */
public class Circle implements ShapeArea {
    private double radius;

    /**
     * конструктор
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return площадь круга
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
