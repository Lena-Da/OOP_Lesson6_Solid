package solid.lsp;

public class Order extends AbstractOrder {

    public Order(int qnt, int price){
        super(qnt, price);
    }

    @Override
    public Integer getAmount() {
        return qnt * price;
    }

}
