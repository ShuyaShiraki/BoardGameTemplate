import java.awt.Color;

public class Controller extends Thread {
	private Grid grid;
	private Board board;
	private int width, height;

	public Controller(Grid grid) {
		this.grid = grid;
		this.width = grid.getWidth();
		this.height = grid.getHeight();
		this.board = new Board(this.width, this.height);
	}

	@Override
	public void run() {
		while (true) {
			this.repaint();
		}
	}

	public void clickedBoard(int x, int y) {
		this.board.putPiece(Color.RED, x, y);
	}

	private void repaint() {
		for(int i=0; i<this.height; i++) {
			for(int j=0; j<this.width; j++) {
				grid.changeColorAt(j, i, board.getPiece(j,i).getColor());
			}
		}
	}

}
