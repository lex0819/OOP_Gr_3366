package Interfaces;

import Classes.Actor;

/**
 * интерфейс методов покупателей
 */
public interface iActorBehaviour {
    /**
     * @param makeOrder
     * истина, если покупатель сделал заказ
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @param pickUpOrder
     * истина, если покупатель получил заказ
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * @return
     * возвращает истину если покупатель сделал заказ
     */
    boolean isMakeOrder();

    /**
     * @return
     * возвращает истину если покупатель получил товар
     */
    boolean isTakeOrder();

    /**
     * @return this
     * возвращает ссылку на объект покупателя
     */
    Actor getActor();
}