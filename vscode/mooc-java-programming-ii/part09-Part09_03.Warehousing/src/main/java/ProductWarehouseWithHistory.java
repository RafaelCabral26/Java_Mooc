public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.productHistory = new ChangeHistory();
        this.productHistory.add(initialBalance);
        

    }

    public String history() {
        return productHistory.toString();
    }

    public void addToWarehouse(double amountToAdd) {
        double newAmount = super.getBalance() + amountToAdd;
        super.addToWarehouse(amountToAdd);
        this.productHistory.add(newAmount);
    }

    public double takeFromWarehouse(double amountToTake) {
        double newAmount = super.getBalance() - amountToTake;
        this.productHistory.add(newAmount);
        return super.takeFromWarehouse(amountToTake);
    }
   
    public void printAnalysis() {
        System.out.println(
            "Product: " + super.getName() + 
            "History: " + this.history() + 
            "Largest amount of product: " + this.productHistory.maxValue() +
            "Smallest amount of product: " + this.productHistory.minValue() +
            "Average: " + this.productHistory.average()
        );
    }
}
