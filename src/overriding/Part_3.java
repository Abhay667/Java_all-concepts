package overriding;

class E {
	Number m1() {
		System.out.println("Object return type");
		return 5;
	}
}

class F extends E {
	Byte m1() {
		System.out.println("String return type");
		return 6;
	}

}

public class Part_3 {

	public static void main(String[] args) {
		E a = new F();
		a.m1();
	}

}