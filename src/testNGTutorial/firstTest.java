package testNGTutorial;

public class firstTest {
	int a = 5;
	int b = 6;
	int tester=0;
	int tester2=1;
	int tester7pm=7;
	

	public void getFirstTest() {

		System.out.println("hi");
	}

	public void Tester2Test() {
		System.out.println("this is tester 2 modification");
		System.out.println("jp");
		
	}

	private void getThird() {
		System.out.println("kumar is sleeping");
		System.out.println(b);
	}
	
	private void getFourth() {
		System.out.println("this is a method from tester 2");

	}
	
	public void getSixth() {
		System.out.println("this is a method from tester1");

	}
	public void getFifth() {
		System.out.println("this is a method from tester2");

	}

	public static void main(String[] args) {
		firstTest fs = new firstTest();
		fs.getFirstTest();
		fs.getThird();
		fs.Tester2Test();
		fs.getFourth();
		fs.getFifth();
	}

}
