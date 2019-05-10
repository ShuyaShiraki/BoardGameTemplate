import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    public Cell() {

    }

    public void changeColor(Color c) {
        this.setBackground(c);
        this.repaint();
    }
}
