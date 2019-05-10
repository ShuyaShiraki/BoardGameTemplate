import java.util.ArrayList;
import java.util.List;

public class Snake {

	private int[] now;
	private int[] direction;
	private int length;

	private List<int[]> body;


	Snake(int x, int y){
		this.body =  new ArrayList<int[]>();
		this.now = new int[] {x,y};
		this.direction = new int[] {1,0};
		this.length = 3;

		body.add(now);
	}

	List<int[]> getBody() {
		return body;
	}

	void walk() {
		this.now[0] += this.direction[0];
		this.now[1] += this.direction[1];
		this.body.add(now);
		if(this.body.size() > length) {
			this.body.remove(0);
		}
	}

	void turnRight() {
		this.direction = new int[] {1,0};
	}

	void turnLeft() {
		this.direction = new int[] {-1,0};
	}

	void turnUp() {
		this.direction = new int[] {0,-1};
	}

	void turnDown() {
		this.direction = new int[] {0,1};
	}
}
