package gof;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gof {

    private static final int COLS_NUM = 500;
	private static final int ROWS_NUM = 500;
	
	public static void main(final String[] args) throws InterruptedException {
    	
    	 StdDraw.setCanvasSize(COLS_NUM, ROWS_NUM);
         StdDraw.setYscale(1, ROWS_NUM);
         StdDraw.setXscale(1, COLS_NUM);
         StdDraw.setPenRadius(0);
         StdDraw.setPenColor(StdDraw.BLACK);

         List<Cell> cells = new ArrayList<>();
         
         
         
         generaterandomCells(cells);
         
         	while (true) {
				Thread.sleep(1000);
				 StdDraw.show(0);
	        	 StdDraw.clear();
         cells.stream().forEach(p -> {
        	
        	 p.nextGen();
        	 if(p.getAlive()) {
        		 StdDraw.point(p.getX(), p.getY());
        	 }
         });
         	}
         
    }

	private static void generaterandomCells(List<Cell> cells) {
		for(int x = 0 ; x < 500 ;x++) {
        	 Cell cell  = new Cell(new Random().nextInt(500), new Random().nextInt(500));
         cells.add(cell);
         }
         
         cells.stream().forEach(p-> {
        	 StdDraw.point(p.getX(), p.getY());
         });
	}

}
