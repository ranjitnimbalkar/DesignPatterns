package creational.design.pattern.factory.method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		
		BasePizzaFactory pizzaFactory = new PizzaFactory();
		
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza veggiePizza = pizzaFactory.createPizza("veggie");
	}

}
