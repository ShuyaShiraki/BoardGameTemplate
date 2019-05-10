import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
    private Controller controller;

    public KeyboardListener(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37: // 左矢印
                this.controller.onKeyLeftPressed();
                break;
            case 38: // 上矢印
                this.controller.onKeyUpPressed();
                break;
            case 39: // 右矢印
                this.controller.onKeyRightPressed();
                break;
            case 40: // 下矢印
                this.controller.onKeyDownPressed();
                break;
        }
    }
}
