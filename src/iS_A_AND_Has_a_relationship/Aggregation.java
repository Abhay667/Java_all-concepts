//package iS_A_AND_Has_a_relationship;
//
//class SnapDragon {
//	public void ClockSpeed() {
//		System.out.println("3.4 GHz");
//	}
//
//	public void Overclock() {
//		System.out.println("you have the overclock  facility as well");
//	}
//
//}
//
//class Samsung {
//	SnapDragon k; // Declare SnapDragon as a member variable
//
//	// Constructor to initialize the SnapDragon instance
//	public Samsung(SnapDragon s) {
//		k = s;
//	}
//
//	void ShowSpeed() {
//		k.ClockSpeed();
//	}
//}
//
//class OnePlus {
//	SnapDragon k; // Declare SnapDragon as a member variable
//
//	// Constructor to initialize the SnapDragon instance
//	public OnePlus(SnapDragon s) {
//		k = s;
//	}
//
//	void ShowSpeed() {
//		k.ClockSpeed();
//	}
//}
//
//public class Aggregation {
//	public static void main(String[] args) {
//		SnapDragon sd = new SnapDragon(); // Create a SnapDragon instance
//
//		Samsung s = new Samsung(sd); // Provide the SnapDragon instance to Samsung
//		s.ShowSpeed();
//
//		OnePlus o = new OnePlus(sd); // Provide the SnapDragon instance to OnePlus
//		o.ShowSpeed();
//	}
//}
