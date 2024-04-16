import java.util.HashMap;
import java.util.Map;

public class FlishStore {
    private Map<String, Double> products;

    public FlishStore() {
        products = new HashMap<>();
    }

    public void addProduct(String productName, double price) {
        products.put(productName, price);
    }

    public void removeProduct(String productName) {
        products.remove(productName);
    }

    public double calculateTotalPrice(String[] productNames) {
        double totalPrice = 0;
        for (String productName : productNames) {
            if (products.containsKey(productName)) {
                double price = products.get(productName);
                totalPrice += price;
            }
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        FlishStore flishStore = new FlishStore();

        // Add Flish products to the store
        flishStore.addProduct("Flish Product A", 10.99);
        flishStore.addProduct("Flish Product B", 5.99);
        flishStore.addProduct("Flish Product C", 15.99);

        // Calculate total price for a list of Flish products
        String[] productNames = {"Flish Product A", "Flish Product C"};
        double totalPrice = flishStore.calculateTotalPrice(productNames);
        System.out.println("Total price: " + totalPrice);
    }
}
