package gof;


public class Cell {

	private int x ;
	private int y ;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX( final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}
	
	private boolean isAlive(boolean isAlive) {
		return isAlive ? true : false;
	}
}
