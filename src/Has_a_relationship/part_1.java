package Has_a_relationship;

class SnapDragon {
	public void ClockSpeed() {
		System.out.println("3.4 Ghz");
	}
}

class Samsung {
	SnapDragon s = new SnapDragon();

	void ShowSpeed() {
		s.ClockSpeed();
	}

}

class OnePlus
{
	SnapDragon s = new SnapDragon();
	void ShowSpeed()
	{
		s.ClockSpeed();
	}
}

public class part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s = new Samsung();
		s.ShowSpeed();
		OnePlus o = new OnePlus();
		o.ShowSpeed();
	}

}
