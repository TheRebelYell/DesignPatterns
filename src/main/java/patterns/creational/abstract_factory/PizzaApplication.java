package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.factory.ChicagoPizzaFactory;
import patterns.creational.abstract_factory.factory.NewYorkPizzaFactory;
import patterns.creational.abstract_factory.factory.PizzaFactory;

public class PizzaApplication {

    public static void main(String[] args) {
        PizzaFactory nyFactory = new NewYorkPizzaFactory();
        nyFactory.createCheesePizza().order();
        nyFactory.createPepperoniPizza().order();

        PizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        chicagoFactory.createCheesePizza().order();
        chicagoFactory.createPepperoniPizza().order();
    }
}
