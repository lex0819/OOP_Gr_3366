package Interfaces;

public interface iReturnOrder {
  /**
   * покупатель принес товар в магазин
   */
  boolean isBackOrder();

  /**
   * @param makeReturn покупатель заявил о возврате товара тогда возвращает истину
   */
  void setBackOrder(boolean makeReturn);

  /**
   * покупатель получил назад деньги за товар
   */
  boolean isBackMoney();

  /**
   * @param backMoney покупатель получил деньги назад за товар тогда истина
   */
  void setBackMoney(boolean backMoney);
}
