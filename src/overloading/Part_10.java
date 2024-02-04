package overloading;

class Animal {

}

class Monkey extends Animal {

}

class Test {
	void m1(Animal a) {
		System.out.println("Animal");
	}

	void m1(Monkey m) {
		System.out.println("Monkey");
	}
}

public class Part_10 {

	public static void main(String[] args) {
		Test t = new Test();
		Animal a1 = new Animal();
		Monkey m1 = new Monkey();
		Animal a2 = new Monkey();
		t.m1(a1);
		t.m1(m1);
		t.m1(a2);
		

	}

}
