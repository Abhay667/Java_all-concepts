package objectTypeCasting;

class S11 {
	int x = 1;
}

class P11 extends S11 {
	int x = 2;
}

class C11 extends P11 {
	int x = 3;
}

public class Part_26 {

	public static void main(String[] args) {
		C11 c = new C11();
		// P11,c,x
		System.out.println(((P11) c).x);

	}

}
