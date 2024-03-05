package overriding;

class A45 {
	public void m1(int x) {
		System.out.println("class A45");
	}
}

class A46 extends A45 {
	public static void m1(long l) {
		System.out.println("class A46");
	}

}

public class Part_36 {

	public static void main(String[] args) {
		A45 ref = new A46();
		ref.m1(20);

	}

}
