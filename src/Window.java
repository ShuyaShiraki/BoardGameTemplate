import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int gridWidth;
    private int gridHeight;

    public Window(int width, int height) {
        this.gridWidth = width;
        this.gridHeight = height;

        getContentPane().setLayout(
                new GridLayout(height, width, 0, 0)
        );
    }

    public int getGridWidth() {
        return this.gridWidth;
    }

    public int getGridHeight() {
        return this.gridHeight;
    }
}

