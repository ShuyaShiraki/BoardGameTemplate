import javax.swing.WindowConstants;

public class Main {
    public static void main(String[] args) {
        final int width = 20;
        final int height = 20;

        Window window = new Window(width, height);
        Grid grid = new Grid(window);
        Controller controller = new Controller(grid);
        KeyboardListener keyboardListener = new KeyboardListener(controller);

        window.addKeyListener(keyboardListener);
        window.setTitle("Snake Game");
        window.setSize(500, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        controller.run();
    }
}
