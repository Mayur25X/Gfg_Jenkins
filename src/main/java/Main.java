
public class Main {

	public void sum(int a, int b) {
		System.out.println("The Sum of Two number are : " + (a + b));
	}

	public void mul(int a, int b) {
		System.out.println("Mul of Two number : " + a * b);
	}

	public void div(int a, int b) {

		try {
			float c = a / b;
			System.out.println("Div of Two number : " + c);
		} catch (Exception e) {
			System.out.println("Not divible");
		}

	}

	public static void main(String[] args) {

		Main a = new Main();
		a.sum(10, 5);
		a.mul(10, 5);
		a.div(10, 5);
	}
}
