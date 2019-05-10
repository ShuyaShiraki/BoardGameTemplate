import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Board extends Thread {

	private List<List<Piece>> pieces = new ArrayList<>();

	public Board(int width,int height) {
        for (int i = 0; i < height; i++) {
            List<Piece> list = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                list.add(new Piece());
            }
            this.pieces.add(list);
        }
	}


	void putPiece(Color c, int x, int y){
		this.pieces.get(y).get(x).setColor(c);
	}

	public Piece getPiece(int x, int y){
		return this.pieces.get(y).get(x);
	}

}
