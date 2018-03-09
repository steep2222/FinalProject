
package carcomparison;


import java.util.HashMap;

public class Car {

	private String name;
	private HashMap<String, String> attributes = new HashMap<>();

	public HashMap<String, String> getAttributes() {

		return attributes;
	}

	public void addAttribute(String type, String value) {

		attributes.put(type, value);

	}

	public String getAtrribute(String type) {

		return attributes.get(type);
	}
	
	public Car(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void compareCars(Car lamborghini, Car koenigsegg) {
		String horsepower;
		String topSpeed;
		horsepower = lamborghini.getAtrribute("Horsepower");
		topSpeed = lamborghini.getAtrribute("Top Speed");
		System.out.println(horsepower);
		System.out.println(topSpeed);
	}

	@Override
	public String toString() {
		return getName();
	}
}
