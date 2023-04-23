package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class TaxService implements iActorBehaviour, iReturnOrder {
  private String name;
  private boolean isTakeOrder;
  private boolean isMakeOrder;
  private boolean isBackOrder;///< покупатель сделал заявление на возврат товара
  private boolean isBackMoney;///< покупатель получил назад деньги за товар


  /**
   * конструктор
   */
  public TaxService() {
    this.name = "Tax audit";
  }


  public String getName() { return name;}

  @Override
  public boolean isMakeOrder() { return isMakeOrder;}

  @Override
  public boolean isTakeOrder() { return isTakeOrder;}

  @Override
  public void setMakeOrder(boolean makeOrder) { isMakeOrder = makeOrder;}

  @Override
  public void setTakeOrder(boolean pickUpOrder) { isTakeOrder = pickUpOrder;}

  @Override
  public Actor getActor() { return new OrdinaryClient(name);}

  /**
   * покупатель принес товар в магазин
   */
  @Override
  public boolean isBackOrder() { return isBackOrder;}

  /**
   * @param makeReturn покупатель заявил о возврате товара тогда возвращает истину
   */
  @Override
  public void setBackOrder(boolean makeReturn) { isBackOrder = makeReturn;}

  /**
   * покупатель получил назад деньги за товар
   */
  @Override
  public boolean isBackMoney() { return isBackMoney;}

  /**
   * @param backMoney покупатель получил деньги назад за товар тогда истина
   */
  @Override
  public void setBackMoney(boolean backMoney) { isBackMoney = backMoney;}
}