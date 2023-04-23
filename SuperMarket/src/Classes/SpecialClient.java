package Classes;

/**
 * класс ВИП покупатель, у него есть карта магазина
 */
public class SpecialClient extends Actor{
    private int idVIP;

    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public String getName() {
        return super.name + " VIP " + this.getIdVIP();
    }

    public int getIdVIP() {
        return idVIP;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * покупатель принес товар в магазин
     */
    @Override
    public boolean isBackOrder() { return super.isBackOrder;}

    /**
     * @param makeReturn покупатель заявил о возврате товара тогда возвращает истину
     */
    @Override
    public void setBackOrder(boolean makeReturn) { super.isBackOrder = makeReturn;}

    /**
     * покупатель получил назад деньги за товар
     */
    @Override
    public boolean isBackMoney() { return super.isBackMoney;}

    /**
     * @param backMoney покупатель получил деньги назад за товар тогда истина
     */
    @Override
    public void setBackMoney(boolean backMoney) { super.isBackMoney = backMoney;}

}