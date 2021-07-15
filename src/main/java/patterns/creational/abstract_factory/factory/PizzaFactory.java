package patterns.creational.abstract_factory.factory;

import patterns.creational.abstract_factory.pizza.Pizza;

public interface PizzaFactory {

    Pizza createCheesePizza();

    Pizza createPepperoniPizza();
}
