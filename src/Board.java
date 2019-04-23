import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel {

	static final int WIDTH = 500;
	static final int HEIGHT = 500;
	static final int OUTER_MARGIN = 20;
	private int cols, rows;
	private int side;
	private int beginX, beginY, endX, endY;

	Board(int cols, int rows) {
		this.cols = cols;
		this.rows = rows;
		this.setSide(cols, rows);
		this.setEdge();
	}


	private void setSide(int cols, int rows) {
		int rangeX = (WIDTH - OUTER_MARGIN) / cols;
		int rangeY = (HEIGHT - OUTER_MARGIN) / rows;
		if (rangeX < rangeY) this.side = rangeX;
		else this.side =  rangeY;
	}


	private void setEdge() {
		this.beginX = OUTER_MARGIN;
		this.beginY = OUTER_MARGIN;
		this.endX = this.beginX + side * cols;
		this.endY = this.endY + side * rows;
	}





	// 画面描画
	public void paintComponent(Graphics g) {
        // 背景
        g.setColor(Color.gray);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // 盤面描画
        for (int i = 0; i <= this.cols; i++) {
            int x = this.beginX + this.side * i;
            g.setColor(Color.black);
            g.drawRect(x, x, this.beginY, this.endY);
        }
        for (int j = 0; j <= this.rows; j++) {
            int y = this.beginY + this.side * j;
            g.setColor(Color.black);
            g.drawRect(this.beginX, this.endX, y, y);
        }
    }

}
