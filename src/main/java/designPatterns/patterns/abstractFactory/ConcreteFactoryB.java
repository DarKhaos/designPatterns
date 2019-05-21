package designPatterns.patterns.abstractFactory;

public class ConcreteFactoryB implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ConcreteProductAB();
	}

	public AbstractProductB createProductB() {
		return new ConcreteProductBB();
	}

}
