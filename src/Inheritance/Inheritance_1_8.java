package Inheritance;

interface F
{
void m1();	
}
interface G
{
	void m1();
}
interface H extends F,G
{
	void m1();
}

 class I implements H
{
	public void m1()
	{
	System.out.println("m1 methods");
	}
	
}
public class Inheritance_1_8  {

	public static void main(String[] args) {
		I i= new I();
		i.m1();

	}

}
