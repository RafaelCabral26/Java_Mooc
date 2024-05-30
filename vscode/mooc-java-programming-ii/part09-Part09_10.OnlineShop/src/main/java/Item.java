public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String initProduct, int initQty, int initPrice) {
        this.product = initProduct;
        this.qty = initQty;
        this.unitPrice = initPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
