package overriding;

class I {
	private void m1() {
System.out.println("class I method");
	}

}

class J extends I {
	private void m1() {
System.out.println("class J method");
	}
}

public class Part_5 {

	public static void main(String[] args) {
		I i = new J();
		i.m1();
	}

}
