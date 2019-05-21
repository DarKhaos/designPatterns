package designPatterns.exercises.n3_manager.v2.store;

import designPatterns.exercises.n3_manager.v2.manager.Store;

public class StoreProxy implements Store {

	private LineState lineState;
		
	public StoreProxy() {
		try {
			lineState = new OnLineState();
		} catch (Exception e) {
			lineState = new OffLineState();
		}
	}
	
	public void add(int code, int amount) {
		lineState.add(code, amount);
		lineState = lineState.nextState();
	}

	public boolean exist(int code, int amount) {
		boolean result = lineState.exist(code, amount);
		lineState = lineState.nextState();
		return result;
	}

	public void remove(int code, int amount) {
		lineState.remove(code, amount);
		lineState = lineState.nextState();
	}

	public int[][] list() {
		int[][] result = lineState.list();
		lineState = lineState.nextState();
		return result;
	}
	
	public void close() {
		lineState.close();
	}

}
