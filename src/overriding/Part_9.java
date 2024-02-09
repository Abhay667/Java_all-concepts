package overriding;

class Q {
	 void m1()

	{
		System.out.println("class Q m1 method");
	}
}

class R extends Q {
	 void m1() {
		System.out.println(" class R m1 method");
	}

}

public class Part_9 {

	public static void main(String[] args) {
	Q obj = new R();
	obj.m1();

	}

}
