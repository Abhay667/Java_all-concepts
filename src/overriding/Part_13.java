package overriding;

class Y {
	void m1() {
		System.out.println("Y class ");
	}
}

class Z extends Y {
	protected void m1() {
		System.out.println("Z class ");
	}
}

public class Part_13 {

	public static void main(String[] args) {
		Y refer = new Z();
		refer.m1();

	}

}
