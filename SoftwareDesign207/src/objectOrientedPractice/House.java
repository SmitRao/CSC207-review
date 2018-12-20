package objectOrientedPractice;

public abstract class House implements Inhabitable {
	protected boolean basementIsFinished;
	protected int sqft;
	protected Place inPlace;
	
	public abstract void openDoor();
	
	public static final String homeSweetHome() {
		return "Home sweet home!";
	}
	
	public static void main(String[] args) {
		
	}
	
}
