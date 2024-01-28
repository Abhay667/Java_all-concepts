package Encapsulation_;

public class Tightly_encapsulated_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A
{
private int x=10;
}
class B extends A
{
	int y=20;
}
class C extends B
{
	private int z=30;
}

