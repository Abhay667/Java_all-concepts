package CouplingAndCohesion;
// this is an invalid program for Coupling go to 'CouplingB'
class A1 {
	 static int k=0;
	static int m1() {
		//System.out.println("A1");
		return 5;
	}

}

class A2 extends A1 {
	//static int  k;
	static int m1() {
		//System.out.println("A2");
		k=A1.m1() +5;
		
		return k;
	}
}

class A3 extends A2 {
	static int m1() {
		System.out.println("A3");
		return 10;
	}
}

public class Coupling {

	public static void main(String[] args) {
		
A1 ref = new A1();
int value =ref.m1();
System.out.println(value);
ref = new A2();
int value1 = ref.m1();
System.out.println(value1);
//ref= new A3();
//ref.m1();
		
	}

}
