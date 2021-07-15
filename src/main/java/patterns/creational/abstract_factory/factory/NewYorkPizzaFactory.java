package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.pizza.NewYorkCheesePizza;
import patterns.creational.abstract_factory.pizza.NewYorkPepperoniPizza;
import patterns.creational.abstract_factory.pizza.Pizza;

public class NewYorkPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createCheesePizza() {
        return new NewYorkCheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        return new NewYorkPepperoniPizza();
    }
}
