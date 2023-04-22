import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {

  public static void main(String[] args) throws Exception {

    //    Market market = new Market();
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();

    Market market = new Market();
    iActorBehaviour item1 = new OrdinaryClient("Boris");
    iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
    iActorBehaviour item3 = new OrdinaryClient("Dasha");
    iActorBehaviour item4 = new TaxService();

    int maxPromoClients = 3;///< максимальное число участников акции

    iActorBehaviour item5 = new PromoClient("Sergey", "promo1");

    int countPromoActors = ((PromoClient) item5.getActor()).getCountActorPromo();///< подсчет покупателей, которые идут по акции, статика

    /**
     * При создании нового акционного клиента проверяем их общее количество
     * если перевалило за макс. число участников акции
     * то в обслуживании не отказываем полностью
     * а обслуживаем как обычного клиента
     * вместо new PromoClient() делаем new OrdinaryClient()
     */
    iActorBehaviour item6 = countPromoActors < maxPromoClients ? new PromoClient("Pavel", "promo1")
        : new OrdinaryClient("Pavel");
    iActorBehaviour item7 = countPromoActors < maxPromoClients ? new PromoClient("Tanya", "promo1")
        : new OrdinaryClient("Tanya");
    iActorBehaviour item8 = countPromoActors < maxPromoClients ? new PromoClient("Olga", "promo1")
        : new OrdinaryClient("Olga");

    market.acceptToMarket(item1);
    market.acceptToMarket(item2);
    market.acceptToMarket(item3);
    market.acceptToMarket(item4);
    market.acceptToMarket(item5);
    market.acceptToMarket(item6);
    market.acceptToMarket(item7);
    market.acceptToMarket(item8);
    market.update();
  }
}