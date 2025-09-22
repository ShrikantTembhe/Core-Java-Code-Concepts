package demo.interview;

/*
 * Do the subtractions.
 */
public class Demo4 {

	int x;
	int y;

	public void substraction(int a, int b) {
		this.x = a;

		this.y = b;

		int result = a - b;

		System.out.println(result);

	}

	public static void main(String[] args) {

		Demo4 ds = new Demo4();

		ds.substraction(16, 7);
	}
}
