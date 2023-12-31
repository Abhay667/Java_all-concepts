package Operator_2;

public class Operator_16 {

	public static void main(String[] args) {
		
Thread t1 = new Thread();
Object o = new Object();
Object o2 = new Object();
String s = new String("durga123");
System.out.println(t1==o); // child and parent combination 
System.out.println(o==s); // parent and child combination
System.out.println(o==s); // parent and child combination
System.out.println(o2==o); // same type
	}

}
