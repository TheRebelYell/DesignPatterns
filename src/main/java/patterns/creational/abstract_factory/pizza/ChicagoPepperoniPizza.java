package patterns.creational.abstract_factory.pizza;

public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza() {
        setName("Chicago Style Pepperoni Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        getToppings().add("Shredded Mozzarella Cheese");
        getToppings().add("Black Olives");
        getToppings().add("Spinach");
        getToppings().add("Eggplant");
        getToppings().add("Sliced Pepperoni");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}