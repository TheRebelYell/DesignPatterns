package patterns.creational.abstract_factory.pizza;

public class NewYorkCheesePizza extends Pizza {

    public NewYorkCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        getToppings().add("Grated Reggiano Cheese");
    }
}
