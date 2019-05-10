import javax.swing.WindowConstants;

public class Main {
	public static void main(String[] args) {
		final int windowWidth = 500;
		final int windwHeight = 500;
		final int width = 3;
		final int height = 3;

		Window window = new Window(width, height);
		Grid grid = new Grid(window);

		window.setTitle("Board Game");
		window.setSize(windowWidth, windwHeight);
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Controller controller = new Controller(grid);
		MouseListener mouseListener = new MouseListener(controller, window);
		KeyboardListener keyboardListener = new KeyboardListener(controller);

		window.addMouseListener(mouseListener);
		window.addKeyListener(keyboardListener);

		controller.run();
	}
}
