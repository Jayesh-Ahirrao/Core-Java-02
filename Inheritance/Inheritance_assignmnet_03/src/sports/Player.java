package sports;

import utility.Person;

public class Player extends Person {
	private int playerId;
	private double contractFees;

	public Player() {
	}

	public Player(int d, int m, int y, String name, int playerId, double contractFees) {
		super(d, m, y, name);
		this.playerId = playerId;
		this.contractFees = contractFees;
	}

	public Player(int playerId, double contractFees) {
		super();
		this.playerId = playerId;
		this.contractFees = contractFees;
	}

	@Override
	public String toString() {
		return super.toString() + "\nplayerId= " + playerId + ", \ncontract fees= " + contractFees;
	}

}
