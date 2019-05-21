package designPatterns.patterns.visitor.v2.objectStructure;

public class ConcreteElementA implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
