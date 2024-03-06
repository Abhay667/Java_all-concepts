package CouplingAndCohesion;
//this is an invalid program for Coupling go to 'CouplingB'
class A4 {
	int k = 7;

	int m1() {
		k = k + 5;
		System.out.println(k);
		return k;
	}

}

class A5 extends A4 {
	int m1() {
		k = k + 9;
		System.out.println(k);
		return k;
	}
}

public class CouplingA {

	public static void main(String[] args) {
		A4  ref=  new A4();
		ref.m1();
		ref = new A5();
		ref.m1();

	}

}
