package day8.interfaces.extendinginterfaces;

public class ExtendingInterfaces implements ChildInterface {
	// Override ChildInterface method
		public void print() { 
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}

}
