package gof;

import com.google.common.collect.Table.Cell;

public class Gof {

    public static void main(final String[] args) {

        final int ROWS = 500;
        final int COLUMS = 500;

        StdDraw.setCanvasSize(COLUMS, ROWS);
        StdDraw.setYscale(0, ROWS);
        StdDraw.setXscale(0, COLUMS);
        StdDraw.setPenRadius(0);
        StdDraw.setPenColor(StdDraw.BLACK);

        final Cell[][] cells = new Cell[ROWS][COLUMS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMS; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMS; col++) {
                if (cells[row][col].isAlive) {
                    StdDraw.point(row, col);
                }
            }
        }

}
