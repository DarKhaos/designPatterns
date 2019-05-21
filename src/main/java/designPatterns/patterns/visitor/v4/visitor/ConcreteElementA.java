package designPatterns.patterns.visitor.v4.visitor;

public class ConcreteElementA implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
