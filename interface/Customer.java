public class Customer {
    private FoodMenu foodMenu;

    // Constructor
    public Customer() {

    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    // setter and getter
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
        // FoodMenu fm = this.getFoodMenu();
    }

    // order() method
    public void order() {
        FoodMenu fm = this.getFoodMenu();
        fm.scrambleEggsTomatoes();
        fm.yuXiangRouSi();
    }

}
