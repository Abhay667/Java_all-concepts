package objectTypeCasting;
class S12 {
	int x = 1;
}

class P12 extends S12 {
	int x = 2;
}

class C12 extends P12 {
	int x = 3;
}
public class Part_27 {

	public static void main(String[] args) {
	C12 c = new C12();
	//a,b,c
	//S12,p12,c,x;
	System.out.println(((S12)(P12)c).x);

	}

}
