package designPatterns.patterns.visitor.v4.visitor;

public class ConcreteVisitorA implements Visitor {

	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorA");
	}

	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorA");
	}

	public void visitObjectStructure(ObjectStructure objectStructure) {
		for(Element element : objectStructure.getElementList()) {
			element.accept(this);
		}
	}

}
