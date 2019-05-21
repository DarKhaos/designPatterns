package designPatterns.patterns.visitor.v3.iterator;

public class ConcreteVisitorA implements Visitor {

	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorA");
	}

	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorA");
	}

}
