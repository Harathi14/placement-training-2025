class Order {
    String foodItem;
    String customerName;
    
    Order(String foodItem, String customerName) {
        this.foodItem = foodItem;
        this.customerName = customerName;
    }

    void placeOrder() {
        System.out.println("Order placed: " + foodItem + " for " + customerName);
    }
}

class Delivery {
    String deliveryPerson;
    
    Delivery(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    void deliverOrder(Order order) {
        System.out.println("Delivering " + order.foodItem + " to " + order.customerName + " by " + deliveryPerson);
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Order order = new Order("Pizza", "John Doe");
        order.placeOrder();
        
        Delivery delivery = new Delivery("Mike");
        delivery.deliverOrder(order);
        
        System.out.println("Order successfully delivered!");
    }
}
