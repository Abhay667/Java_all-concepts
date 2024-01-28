package Encapsulation_;

public class B extends A {

	public static void main(String[] args) {
		B obj = new B();
		int x = obj.get_money(); // abstraction, no idea  where it is coming from

		System.out.println(x);
		
	}

}
