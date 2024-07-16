/**
 * 
 */

/**
 * to Print hello World
 */
public class Test {
	int id;
	static int salary = 10000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;// Local Variable

		// Single Line Comment
		/* asdflkjasdfasdfasdfasdfasdasdfasdfasd */ // Multi Line Comment
		System.out.println("Hello World " + " Good Evening");
		Test t = new Test();
		t.id = 7;
		System.out.println("Instace Variable for t Object " + t.id);

		Test t2 = new Test();
		t2.id = 16;
		System.out.println("Instace Variable for t2 Object " + t2.id);
		System.out.println("Static Variable  " + Test.salary);
		System.out.println(x);

	}

}

// ALT+SHIFT+X,J
// ctRL+SHIFT+l TO SEE ALL THE SHORTCUTS