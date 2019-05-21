package designPatterns.patterns.visitor.v3.iterator;

public class ConcreteElementA implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
