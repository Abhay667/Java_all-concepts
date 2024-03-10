package CouplingAndCohesion;

class A6 {
	int k = 7;

	int m1() {
		k = k + 5;
		// System.out.println(k);
		return k;
	}

}
//12

class A7 extends A6 {
	int m1() {
		k = super.m1() + 5;
		// System.out.println(k);
		return k;
	}
}

//12 17
class A8 extends A7 {
	int m1() {
		k = super.m1() + 5;
		// System.out.println(k);
		return k;
	}
}

//12 17 22
public class CouplingB {

	public static void main(String[] args) {
		A6 ref = new A6();
		// ref.m1();
		// ref = new A7();
		// ref.m1();
		ref = new A8();
		int value = ref.m1();
		System.out.println(value);

	}

}
