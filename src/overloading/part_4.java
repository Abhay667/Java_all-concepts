package overloading;

class B {
	void m(char a) {
		System.out.println("double type");
	}
}

public class part_4 {

	public static void main(String[] args) {
		B b = new B();
		b.m(10);
		b.m('a');
		b.m(10l);
		b.m(10.0);

	}

}
