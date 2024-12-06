public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        GroceryItemOrder item1 = new GroceryItemOrder("Cookies", 2.30);
        item1.setQuantity(4);
        groceryList.add(item1);

        GroceryItemOrder item2 = new GroceryItemOrder("Milk", 1.50);
        item2.setQuantity(2);
        groceryList.add(item2);

        System.out.println("Total Cost: $" + groceryList.getTotalCost());
    }
}