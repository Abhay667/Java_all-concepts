package overriding;

class C {
	Object m1() {
		System.out.println("Object return type");
		return new A();
	}
}

class D extends C {
	String m1() {
		System.out.println("String return type");
		return "hi";
	}

}

public class part_2 {

	public static void main(String[] args) {
		C a = new D();
		a.m1();
	}

}
