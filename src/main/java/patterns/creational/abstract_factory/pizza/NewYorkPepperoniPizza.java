package patterns.creational.abstract_factory.pizza;

public class NewYorkPepperoniPizza extends Pizza {
    public NewYorkPepperoniPizza() {
        setName("NY Style Pepperoni Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        getToppings().add("Grated Reggiano Cheese");
        getToppings().add("Sliced Pepperoni");
        getToppings().add("Garlic");
        getToppings().add("Onion");
        getToppings().add("Mushrooms");
        getToppings().add("Red Pepper");
    }
}
