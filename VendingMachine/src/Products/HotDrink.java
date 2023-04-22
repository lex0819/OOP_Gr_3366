package Products;

/**
 * Класс горячих напитков
 */
public class HotDrink extends Product {
    private int volume;
    private int temperature;

    /**
     * Это описание конструктора
     *
     * @param name это название напитка
     * @param price это цена за единицу напитка
     * @param temperature это температура готового напитка
     * @param volume это сколько милилитров готового напитка
     */
    public HotDrink(String name, Double price, int temperature, int volume) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;

    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
