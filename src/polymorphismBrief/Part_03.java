package polymorphismBrief;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class O3 {
	ArrayList m1() {
		ArrayList a = new ArrayList<>();
		return a;
	}
}

class P3 {
	LinkedList m2() {
		LinkedList l = new LinkedList<>();
		return l;
	}

}

class S3 {
	Vector m3() {
		Vector v = new Vector<>();
		return v;
	}

}

public class Part_03 {

	public static void main(String[] args) {
		O3 o = new O3();
		P3 p = new P3();
		S3 s = new S3();
		List a1 = o.m1();
		List a2 = p.m2();
		List a3 = s.m3();
	}

}
