package overriding;

class U {
	void m1() {
		System.out.println("class U method");
	}
}

class V extends U {
	public void m1() {
		System.out.println("class V method");
	}
}

public class Part_11 {

	public static void main(String[] args) {
		U ref = new V();

		ref.m1();

	}

}
