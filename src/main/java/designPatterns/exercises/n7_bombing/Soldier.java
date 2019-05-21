package designPatterns.exercises.n7_bombing;

import designPatterns.exercises.n7_bombing.library.Coordinate;
import designPatterns.exercises.n7_bombing.library.Person;

public class Soldier implements Target {

	private Person person;
	
	public Soldier(Coordinate coordinate) {
		person = new Person(coordinate);
	}

	public Coordinate getCoordinate() {
		return person.getCoordinate();
	}

	public int getDamaged() {
		return person.getInjured();
	}

	public boolean isAttacking() {
		return person.isShooting();
	}	
	
}
