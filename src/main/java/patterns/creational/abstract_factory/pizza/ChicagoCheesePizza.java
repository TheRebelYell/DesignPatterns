package patterns.creational.abstract_factory.pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        getToppings().add("Shredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
