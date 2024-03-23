package objectTypeCasting;

class S10 {
	int x = 1;
}

class P10 extends S10 {
	int x = 2;
}

class C10 extends P10 {
	int x = 3;
}

public class Part_25 {

	public static void main(String[] args) {
		C10 c = new C10();

		System.out.println(c.x);
	}

}
