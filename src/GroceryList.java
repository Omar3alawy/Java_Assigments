import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}
