import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<List<Cell>> grid;
    private int width;
    private int height;

    private Window window;

    public Grid(Window window) {
        int width = window.getGridWidth();
        int height = window.getGridHeight();

        this.width = width;
        this.height = height;
        this.window = window;

        this.grid = new ArrayList<>(height);

        for (int i = 0; i < height; i++) {
            List<Cell> list = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                list.add(new Cell());
            }
            this.grid.add(list);
        }

        Container container = this.window.getContentPane();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                container.add(this.grid.get(i).get(j));
            }
        }

    }

    public void changeColorAt(int x, int y, Color c) {
        if (x < 0 || x >= this.width) return;
        if (y < 0 || y >= this.height) return;

        this.grid.get(y).get(x).changeColor(c);
    }

    public int getWidth() {return this.width;}
    public int getHeight() {return this.height;}

}
