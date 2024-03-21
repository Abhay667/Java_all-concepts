package overriding;

class A57 {

}

class A58 extends A57 {
	void m1() {
		System.out.println("child class method");
	}
}

public class Part_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A57 ref = new A58();
		ref.m1();
	}

}
