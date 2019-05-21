package designPatterns.exercises.n2_tickets.v1.operations;

import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Footer;
import designPatterns.exercises.n2_tickets.v1.ticket.Header;
import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;
import designPatterns.exercises.n2_tickets.v1.ticket.TicketVisitor;

public abstract class TicketOperation implements TicketVisitor {

	protected Ticket ticket;
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void visit(Header head) {
	}

	public void visit(SaleLine saleLine) {
	}

	public void visit(RepetitionLine repetitionLine) {
	}

	public void visit(CancellationLine cancellationLine) {
	}

	public void visit(ReturnLine returnLine) {
	}

	public void visit(Footer footer) {
	}

}
