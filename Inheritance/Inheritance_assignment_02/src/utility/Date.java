package utility;

public class Date {
	private int d;
	private int m;

	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public Date() {
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int y;

	@Override
	public String toString() {
		return d + "-" + m + "-" + y;
	}

}
