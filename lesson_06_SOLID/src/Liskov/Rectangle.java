package Liskov;

/**
 * класс Прямоугольник
 */
public class Rectangle extends Square {
    private int height;

    /**
     * конструктор
     * @param width  ширина прямоугольника
     * @param height высота прямоугольника
     */
    public Rectangle(int width, int height){
        super(width);
        this.height = height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return площадь прямоугольника
     */
    @Override
    public int area() {
        return this.width * this.height;
    }

    public int getWidth() {
        return super.width;
    }

    public int getHeight() {
        return this.height;
    }
}
