package designPatterns.patterns.visitor.v2.objectStructure;

public class ConcreteElementB implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
