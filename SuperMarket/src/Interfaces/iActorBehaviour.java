package Interfaces;

import Classes.Actor;

/**
 * интерфейс методов покупателей
 */
public interface iActorBehaviour {
    /**
     * @return возвращает истину если покупатель сделал заказ
     */
    boolean isMakeOrder();

    /**
     * @param makeOrder
     * устанавливает истину, если покупатель сделал заказ
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @return возвращает истину если покупатель получил товар
     */
    boolean isTakeOrder();

    /**
     * @param pickUpOrder
     * устанавливает истину, если покупатель получил заказ
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * @return this
     * возвращает ссылку на объект покупателя
     */
    Actor getActor();
}