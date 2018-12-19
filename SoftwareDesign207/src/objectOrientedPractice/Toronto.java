package objectOrientedPractice;

public class Toronto extends Place {
	private String mayor;
	private int population;
	
	public Toronto(int weather) {
		super(weather, "Toronto", -26.884920, 89.449921);
		this.mayor = "John Tory";
		this.population = 2000000;
	}
	
	public int getPopulation() {return this.population;}
	public String getMayor() {return this.mayor;}
	
	public static void main(String[] args) {
		Toronto theSix = new Toronto(647);
		System.out.println(theSix.getWeather());
		System.out.println(theSix.getName());
		System.out.println(theSix.getMayor());
	}
}
