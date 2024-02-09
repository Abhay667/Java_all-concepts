package overriding;

class S {
	 void m1() {
		System.out.println("class S method");
	}
}

class T extends S {
	private void m1() {
		System.out.println("class T method");
	}
}

public class Part_10 {

	public static void main(String[] args) {
		S ref = new T();
		ref.m1();
	}

}
