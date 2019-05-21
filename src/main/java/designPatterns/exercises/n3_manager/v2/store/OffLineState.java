package designPatterns.exercises.n3_manager.v2.store;

import designPatterns.exercises.n3_manager.v2.utils.YesNoDialog;

public class OffLineState implements LineState {

	private StoreImplementation storeImplementation;

	public OffLineState() {
		storeImplementation = new StoreImplementation();
	}

	public OffLineState(int[][] storeState) {
		this();
		for (int[] product : storeState) {
			storeImplementation.add(product[0], product[1]);
		}
	}

	public void add(int code, int amount) {
		storeImplementation.add(code, amount);
	}

	public boolean exist(int code, int amount) {
		return storeImplementation.exist(code, amount);
	}

	public void remove(int code, int amount) {
		storeImplementation.remove(code, amount);
	}

	public int[][] list() {
		return storeImplementation.list();
	}

	public void close() {
		boolean exit;
		do {
			System.out
					.println("Sin conexión al servidor los datos se perderán");
			exit = YesNoDialog.instance().read("Abandonar? ");
			if (!exit) {
				try {
					OnLineState onLineStoreProxy = new OnLineState();
					int[][] list = storeImplementation.list();
					for (int[] product : list) {
						onLineStoreProxy.add(product[0], product[1]);
					}
					exit = true;
					System.out.println("Datos en servidor");
					onLineStoreProxy.close();
				} catch (Exception e) {
				}
			}
		} while (!exit);
	}

	public LineState nextState() {
		try {
			OnLineState onLineStoreProxy = new OnLineState();
			int[][] list = storeImplementation.list();
			for (int[] product : list) {
				onLineStoreProxy.add(product[0], product[1]);
			}
			return onLineStoreProxy;
		} catch (Exception e) {
			return this;
		}
	}

}
