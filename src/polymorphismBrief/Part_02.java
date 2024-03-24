package polymorphismBrief;

import java.util.ArrayList;
import java.util.List;

class P2 {
	List m1() {
		ArrayList a = new ArrayList<>();
		System.out.println("another form of polymorphism");
		return a;
	}
}

public class Part_02 {

	public static void main(String[] args) {
	Object o = new P2();
	((P2) o).m1();

	}

}
