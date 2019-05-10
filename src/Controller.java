import java.awt.Color;

public class Controller extends Thread {
	private Grid grid;
	private Snake snake;

	public Controller(Grid grid) {
		this.grid = grid;
		this.snake = new Snake(3,10);
	}

	@Override
	public void run() {
		while(true) {
			this.delay(1000);
			System.out.println("walk!!");
			this.repaint();
		}
	}

	private void delay(long ms) {
		try {
			sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void onKeyUpPressed() {
		System.out.println("Key up");
		this.snake.turnUp();
	}

	public void onKeyDownPressed() {
		System.out.println("Key down");
		this.snake.turnDown();
	}

	public void onKeyLeftPressed() {
		System.out.println("Key left");
		this.snake.turnLeft();
	}

	public void onKeyRightPressed() {
		System.out.println("Key right");
		this.snake.turnRight();
	}

	private void repaint() {
		for(int[] position: this.snake.getBody()) {
			this.grid.changeColorAt(position[0], position[1], Color.WHITE);
		}
		this.snake.walk();
		for(int[] position: this.snake.getBody()) {
			this.grid.changeColorAt(position[0], position[1], Color.BLUE);
		}
	}

}
