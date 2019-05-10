import java.awt.Color;

import javax.swing.JPanel;

public class Cell extends JPanel {
    public Cell() {

    }

    public void changeColor(Color c) {
        this.setBackground(c);
        this.repaint();
    }
}
