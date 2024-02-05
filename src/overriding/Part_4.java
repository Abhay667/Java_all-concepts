package overriding;

class G {
	int m1() {
		System.out.println("Object return type");
		return 5;
	}
}

class H extends G {
	double m1() {
		System.out.println("String return type");
		return 6.9;
	}

}

public class Part_4 {

	public static void main(String[] args) {
		G a = new H();
		a.m1();
	}

}