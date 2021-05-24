public class Test {
    public static void main(String[] args) {
        // create a cook object
        FoodMenu cook1 = new ChineseCook();
        // FoodMenu cook2 = new WesternCook();
        // create a Customer object
        Customer customer = new Customer(cook1);

        customer.order();
    }
}
