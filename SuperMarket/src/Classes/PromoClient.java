package Classes;

/**
 * класс Акционный клиент
 */
public class PromoClient extends Actor {

  private String promoName;///< название акции

  private static int countActorPromo;///< число покупателей, пришедших по акции, статический счетчик

  static {
    countActorPromo = 0;///< сквозная нумерация покупателей в акции
  }

  /**
   * @param name имя покупателя
   * конструктор
   */
  public PromoClient(String name, String promoName) {
    super(name);
    this.promoName = promoName;
    countActorPromo++;
  }

  /**
   * @return name возвращает имя покупателя
   */
  @Override
  public String getName() {
    return super.name + " акция " + this.getPromoName();
  }

  /**
   * @return promoName возвращает название акции
   */
  public String getPromoName() {
    return this.promoName;
  }

  /**
   * @return countActorPromo возвращает число покупателей, пришедших по Акции
   */
  public int getCountActorPromo() {
    return countActorPromo;
  }

  /**
   * @param makeOrder истина, если покупатель сделал заказ
   */
  @Override
  public void setMakeOrder(boolean makeOrder) {
    super.isMakeOrder = makeOrder;
  }

  /**
   * @param pickUpOrder истина, если покупатель получил заказ
   */
  @Override
  public void setTakeOrder(boolean pickUpOrder) {
    super.isTakeOrder = pickUpOrder;
  }

  /**
   * @return возвращает истину если покупатель сделал заказ
   */
  @Override
  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  /**
   * @return возвращает истину если покупатель получил товар
   */
  @Override
  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  /**
   * @return this возвращает ссылку на объект покупателя
   */
  @Override
  public Actor getActor() {
    return this;
  }
}
