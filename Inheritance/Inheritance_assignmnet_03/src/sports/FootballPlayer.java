package sports;

public class FootballPlayer extends Player {
	private int totalGoalsScored;

	public FootballPlayer() {
	}

	public FootballPlayer(int playerId, double contractFees, int totalGoalsScored) {
		super(playerId, contractFees);
		this.totalGoalsScored = totalGoalsScored;
	}

	public FootballPlayer(int d, int m, int y, String name, int playerId, double contractFees, int totalGoalsScored) {
		super(d, m, y, name, playerId, contractFees);
		this.totalGoalsScored = totalGoalsScored;
	}

	public FootballPlayer(int totalGoalsScored) {
		super();
		this.totalGoalsScored = totalGoalsScored;
	}

	@Override
	public String toString() {
		return super.toString() + "\ntotal goals scored= " + totalGoalsScored;
	}

}
