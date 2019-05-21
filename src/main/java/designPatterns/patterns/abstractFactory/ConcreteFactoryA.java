package designPatterns.patterns.abstractFactory;

public class ConcreteFactoryA implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ConcreteProductAA();
	}

	public AbstractProductB createProductB() {
		return new ConcreteProductBA();
	}

}
