package objectOrientedPractice;

public class WhiteHouse extends House {
	
	public WhiteHouse() {
		this.basementIsFinished = true;
		this.inPlace = new Toronto(647);
		this.sqft = 20000;
	}

	@Override
	public void openDoor() {
		System.out.println("Welcome, the president is waiting for you.");
	}
	
	public void understandPlace() {
		System.out.println(this.inPlace.getName());
	}
	
	public static void main(String[] args) {
		System.out.println(House.homeSweetHome());
		WhiteHouse whiteHouse = new WhiteHouse();
		whiteHouse.openDoor();
		whiteHouse.understandPlace();
	}
}
