package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * класс Магазин, в нем Очередь из покупателей
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {

  private List<iActorBehaviour> queue;///< очередь из покупателей-интерфейсов

  /**
   * конструктор
   */
  public Market() {
    this.queue = new ArrayList<iActorBehaviour>();
  }

  /**
   * @param actor покупатель покупатель зашёл в магазин
   */
  @Override
  public void acceptToMarket(iActorBehaviour actor) {
    System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
    takeInQueue(actor);
  }

  /**
   * в учебных целях каждые 1й и 2й клиенты будут делать заказ
   * а каждый 3й будет возвращать товар в магазин
   */
  @Override
  public void takeOrder() {
    int i = 1;
    for (iActorBehaviour actor : queue) {
      if (!actor.isMakeOrder() && (i % 3 != 0) ) {
        actor.setMakeOrder(true);
        System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
      }else{
        actor.getActor().setBackOrder(true);
        System.out.println(actor.getActor().getName() + " клиент сделал заявление на возврат товара");
      }
      i++;
    }
  }

  /**
   * @param actor покупатель добавление покупателя в Очередь
   */
  @Override
  public void takeInQueue(iActorBehaviour actor) {
    this.queue.add(actor);
    System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
  }

  /**
   * метод проверяет зачем покупатель стоит в очереди - на возврат, либо за покупкой
   * и либо выдает товар, либо возвращает деньги
   */
  @Override
  public void giveOrder() {
    for (iActorBehaviour actor : queue) {
      if (actor.isMakeOrder()) {
        actor.setTakeOrder(true);
        System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
      } else if (actor.getActor().isBackOrder()) {
        actor.getActor().setBackMoney(true);
        System.out.println(actor.getActor().getName() + " клиент вернул деньги за товар");
      }
    }
  }

  @Override
  public void releaseFromQueue() {
    List<Actor> releaseActors = new ArrayList<>();
    for (iActorBehaviour actor : queue) {
      if (actor.isTakeOrder() || actor.getActor().isBackMoney()) {
        releaseActors.add(actor.getActor());
        System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
      }
    }
    releaseFromMarket(releaseActors);
  }

  @Override
  public void releaseFromMarket(List<Actor> actors) {
    for (Actor actor : actors) {
      System.out.println(actor.getName() + " клиент ушел из магазина ");
      queue.remove(actor);
    }
  }

  @Override
  public void update() {
    takeOrder();
    giveOrder();
    releaseFromQueue();
  }
}