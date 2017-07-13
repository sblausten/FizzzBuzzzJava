
public class Program {
	public static void main( String args[] ) {
		for (int count = 0; count <= 100; count++) {
			FizzBuzz runner = new FizzBuzz();
			runner.processNum(count);
			System.out.println(runner.getResponse());
		}
	}
}
