import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel {

	static final int WIDTH = 1000;
	static final int HEIGHT = 1000;
	private int cols, rows;
	private int side;
	private int beginX, beginY, endX, endY;
	int boardState[][];

	Board(int cols, int rows) {
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.cols = cols;
		this.rows = rows;
		this.boardState = new int [cols][rows];
		this.setSide(cols, rows);
		this.setEdge();
	}


	private void setSide(int cols, int rows) {
		int rangeX = WIDTH / cols;
		int rangeY = HEIGHT / rows;
		if (rangeX < rangeY) this.side = rangeX;
		else this.side =  rangeY;
	}


	private void setEdge() {
		this.beginX = 0;
		this.beginY = 0;
		this.endX = side * cols;
		this.endY = side * rows;
	}


	// 画面描画
	public void paintComponent(Graphics g) {
        // 背景
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // 盤面描画
        for (int i = 0; i <= this.cols; i++) {
            int x = this.beginX + this.side * i;
            g.setColor(Color.black);
            g.drawLine(x, this.beginY, x, this.endY);
        }
        for (int j = 0; j <= this.rows; j++) {
            int y = this.beginY + this.side * j;
            g.setColor(Color.black);
            g.drawLine(this.beginX, y, this.endX, y);
        }
    }

}
