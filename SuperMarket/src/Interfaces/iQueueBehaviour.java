package Interfaces;

/**
 * интерфейс методов Очереди
 */
public interface iQueueBehaviour {
    /**
     * @param actor покупатель
     * добавление покупателя в Очередь
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * удаление покупателей из очереди
     */
    void releaseFromQueue();

    /**
     * покупатель сделал заказ
     */
    void takeOrder();

    /**
     * покупатель получил товар
     */
    void giveOrder();
}