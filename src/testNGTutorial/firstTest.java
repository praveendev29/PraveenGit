package testNGTutorial;

public class firstTest {
	int a = 5;
	int b = 6;
	int tester=0;
	int tester2=1;

	public void getFirstTest() {

		System.out.println("hi");
	}

	private void mySecondTest() {
		System.out.println("this is tester 2");
		System.out.println(a);

	}

	private void getThird() {
		System.out.println("kumar is sleeping");
		System.out.println(b);
	}
	
	private void getFourth() {
		System.out.println("this is a method from tester 2");

	}

	public static void main(String[] args) {
		firstTest fs = new firstTest();
		fs.getFirstTest();
		fs.getThird();
		fs.mySecondTest();
		fs.getFourth();
	}

}
