package designPatterns.patterns.visitor.v3.iterator;

public class ConcreteVisitorB implements Visitor {

	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorB");
	}

	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorB");
	}

}
