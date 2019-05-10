import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {

    private Controller controller;
    private int width, height;
    private int sideWidth, sideHeight;

    public MouseListener(Controller controller, Window window) {
        this.controller = controller;
        this.width = window.getGridWidth();
        this.height = window.getGridHeight();
        this.sideWidth = window.getWidth()/window.getGridWidth();
        this.sideHeight = window.getHeight()/window.getGridHeight();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    	super.mouseClicked(e);
    	int x = e.getX()/this.sideWidth;
    	int y = e.getY()/this.sideHeight;
        if (x < 0 || x > this.width) return;
        if (y < 0 || y > this.height) return;

        controller.clickedBoard(x, y);
    }

}
