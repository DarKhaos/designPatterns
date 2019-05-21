package designPatterns.patterns.visitor.v3.iterator;

public class ConcreteElementB implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
