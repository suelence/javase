public class Test {
    public static void main(String[] args) {
        // FoodMenu cook1 = new ChineseCook();
        FoodMenu cook1 = new WesternCook();
        Customer customer = new Customer(cook1);
        customer.order();
    }
}
