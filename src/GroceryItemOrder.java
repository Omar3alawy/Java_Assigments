public class GroceryItemOrder {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public GroceryItemOrder(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = 1; // Default quantity
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
