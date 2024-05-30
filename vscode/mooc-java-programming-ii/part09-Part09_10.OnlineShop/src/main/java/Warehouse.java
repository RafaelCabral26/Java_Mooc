import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> myProducts;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.myProducts = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String initProduct, int initPrice, int initStock) {
        this.myProducts.put(initProduct, initPrice);
        this.stock.put(initProduct, initStock);
    }

    public int price(String product) {
        try {
            return myProducts.get(product);
        } catch (Exception e) {
            return -99;
        }
    }

    public int stock(String product) {
        try {
            return stock.get(product);
        } catch (Exception e) {
            return 0;
        }
    }

    public boolean take(String product) {
        try {
            if (stock.get(product) > 0) {
                stock.put(product, (stock.get(product) - 1));
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> listProcuts = this.myProducts.keySet();
        return listProcuts;
    }
}
