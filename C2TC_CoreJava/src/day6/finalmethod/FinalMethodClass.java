package day6.finalmethod;

public class FinalMethodClass {
	FinalMethodClass() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	// Final method
	void show() {
		System.out.println("Value of a: " + a);
	}

}
