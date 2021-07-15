package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.pizza.ChicagoCheesePizza;
import patterns.creational.abstract_factory.pizza.ChicagoPepperoniPizza;
import patterns.creational.abstract_factory.pizza.Pizza;

public class ChicagoPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createCheesePizza() {
        return new ChicagoCheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        return new ChicagoPepperoniPizza();
    }
}
