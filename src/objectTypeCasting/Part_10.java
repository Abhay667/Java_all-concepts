package objectTypeCasting;

class Base1 {

}

class Base2 {

}

class Drive1 extends Base1 {

}

class Drive2 extends Base1 {

}

class Drive3 extends Base2 {

}

class Drive4 extends Base2 {

}

public class Part_10 {

	public static void main(String[] args) {
		Base2 b = new Drive4();
		Object o = (Drive3) b;
//       A     b =   (C)   d;

	}

}
