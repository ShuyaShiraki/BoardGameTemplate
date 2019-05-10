import java.awt.Color;

class Piece {


	private static final Color background = Color.WHITE;
	private Color color;

	Piece(){this.color = background;}
	Piece(Color c){this.color = c;}

	public Color getColor() {return this.color;}

	public void setColor(Color c) {this.color = c;}

	public void setBlank() {this.color = background;}
}