package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * абстрактный класс покупатель
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;///< имя покупателя
    protected boolean isMakeOrder;///< покупатель сделал заказ в магазине
    protected boolean isTakeOrder;///< покупатель получил заказ
    protected boolean isBackOrder;///< покупатель сделал заявление на возврат товара
    protected boolean isBackMoney;///< покупатель получил назад деньги за товар

    /**
     * @param name имя покупателя
     * конструктор
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * @return name имя покупателя
     */
    public abstract String getName();

}