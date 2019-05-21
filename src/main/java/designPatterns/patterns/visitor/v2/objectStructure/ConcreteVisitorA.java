package designPatterns.patterns.visitor.v2.objectStructure;

public class ConcreteVisitorA implements Visitor {

	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorA");
	}

	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorA");
	}

}
