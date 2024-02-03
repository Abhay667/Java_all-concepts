package overloading;


class E
{
	void m1(String s)
	{
	System.out.println("String");	
	}
	void m1(StringBuffer s)
	
	{
	System.out.println("StringBuffer");	
	}
}
public class Part_7 {

	public static void main(String[] args) {
		E e = new E();
		e.m1(null);

	}

}
