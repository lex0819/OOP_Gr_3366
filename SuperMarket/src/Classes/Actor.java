package Classes;

import Interfaces.iActorBehaviour;

/**
 * абстрактный класс покупатель
 */
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * @param name имя покупателя
     */
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}