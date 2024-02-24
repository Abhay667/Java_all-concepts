package overriding;

import java.io.IOException;

class A3 {
	void m1() throws IOException{
		System.out.println("A3 method");

	}
}

class A4 extends A3 {
	void m1()throws IOException {
		System.out.println("A4 method");
	}

}

public class Part_15 {

	public static void main(String[] args) {
		
	}

}
