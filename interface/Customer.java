public class Customer {
    private FoodMenu foodMenu;
   
    //Constructor
    public Customer() {

    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    // order(); Method
    public void order() {
        foodMenu.scrambleEggsTomatoes();
        foodMenu.yuXiangRouSi();
    }

    // setter and getter Method
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
}
