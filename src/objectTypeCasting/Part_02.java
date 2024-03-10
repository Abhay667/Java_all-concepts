package objectTypeCasting;

interface Animal {
	void m1();
}

class A3 implements Animal {
	public void m1() // public
	{
		System.out.println("using interface reference to hold child " + "class object");
	}
}

public class Part_02 {

	public static void main(String[] args) {
		Animal InterfaceRefer = new A3();
		InterfaceRefer.m1();

	}

}
