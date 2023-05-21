package shape;

/**
 * класс Куб
 */
public class Cube implements ShapeArea, ShapeVolume {
    private int edge;

    /**
     * конструктор
     * @param edge сторона куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**
     * @return площадь куба
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * @return объём куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
