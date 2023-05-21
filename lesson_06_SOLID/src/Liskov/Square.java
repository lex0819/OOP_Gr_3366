package Liskov;

/**
 * класс Квадрат
 */
public class Square{
    int width;

    /**
     * конструктор
     * @param width сторона квадрата
     */
    public Square(int width){
        this.width = width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return площадь квадрата
     */
    public int area() {
        return this.width * this.width;
    }
}
