package cricket;

public class TestCricet implements Players {

	public static void main(String[] args) {
		
		TestCricet t = new TestCricet();
		t.bowling();
		t.feilding();
		t.throwing();
		
		

	}

	@Override
	public void bowling() {
	System.out.println("bowled");
		
	}

	@Override
	public void feilding() {
		System.out.println("super catch");
		
	}

	@Override
	public void throwing() {
		System.out.println("run out");
		
	}

		
		
	}

