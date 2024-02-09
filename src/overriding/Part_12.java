package overriding;
class W
{
	protected void m1()
	{
		System.out.println("class W ");
	}
}
class X extends W
{
	 public void m1()
	{
		System.out.println("class X");
		
	}
}

public class Part_12 {

	public static void main(String[] args) {
	W ref = new X();
	ref.m1();

	}

}
