package Interfaces;

import java.util.List;
import Classes.Actor;

/**
 * интерфейс методов Магазина
 */
public interface iMarketBehaviour {
    /**
     * @param actor покупатель
     * покупатель зашёл в магазин
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * @param actors список покупателей
     * покупатели ушли из магазина
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * обновление состояния и наличия покупателей в магазине
     */
    void update();
}
