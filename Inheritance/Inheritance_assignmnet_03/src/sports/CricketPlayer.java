package sports;

/**
 * 
 */
public class CricketPlayer extends Player {
	private int totalRunsScored;
	private int totalWicketsTaken;

	public CricketPlayer() {
	}

	public CricketPlayer(int playerId, double contractFees, int totalRunsScored, int totalWicketsTaken) {
		super(playerId, contractFees);
		this.totalRunsScored = totalRunsScored;
		this.totalWicketsTaken = totalWicketsTaken;
	}

	public CricketPlayer(int d, int m, int y, String name, int playerId, double contractFees, int totalRunsScored,
			int totalWicketsTaken) {
		super(d, m, y, name, playerId, contractFees);
		this.totalRunsScored = totalRunsScored;
		this.totalWicketsTaken = totalWicketsTaken;
	}

	public CricketPlayer(int totalRunsScored, int totalWicketsTaken) {
		super();
		this.totalRunsScored = totalRunsScored;
		this.totalWicketsTaken = totalWicketsTaken;
	}

	@Override
	public String toString() {
		return super.toString() + "\ntotalRunsScored= " + totalRunsScored + ", \ntotalWicketsTaken= "
				+ totalWicketsTaken;
	}

}
