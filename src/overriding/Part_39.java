package overriding;

import java.io.IOException;

class A51 {
	public void m1(int x) throws IOException {
		System.out.println("class A51");
	}

	abstract class A52 extends A51 {
public static abstract void m1(int x)
{
	System.out.println("class A51");
}
	}

public class Part_39 {

	public static void main(String[] args) {

	}

}
