package objectOrientedPractice;

public class Place {
	private int weather; // Fahrenheit
	private String name; // ex. Toronto, Mexico, Staples Center, Columbia University, P.E.I.
	private double longitude; // any longitude within this place s.t. latitude applies correctly
	private double latitude; // any latitude within this place s.t. longitude applies correctly
	
	public Place(int weather, String name, double longitude, double latitude) {
		this.weather = weather;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public void setWeather(int newWeather) {
		this.weather = newWeather;
	}
	
	public int getWeather() {
		return this.weather;
	}
	
	public double[] getGeolocation() {
		return new double[] {this.longitude, this.latitude};
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Place randPlace = new Place(77, "Miami", -32.234234, 93.894982); // instantiate place
		System.out.println(randPlace.getWeather()); // 77 deg F
		randPlace.setWeather(randPlace.getWeather()+21); // 77 + 21 new weather in deg F
		System.out.println(randPlace.getWeather()); // 98 deg F
	}
}
