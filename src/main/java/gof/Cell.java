package gof;

import java.util.List;
import java.util.Random;

public class Cell {

    int x;
    int y;
    boolean isAlive;

    public Cell(final int x, final int y) {
        this.x = x;
        this.y = y;
        final Random rand = new Random();
        setAlive(rand.nextBoolean());
    }

    public boolean getAlive() {
        return isAlive;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public void setAlive(final boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void nextGen(final List<Cell> cells) {
        final Random rand = new Random();
        setAlive(rand.nextBoolean());
    }

}
