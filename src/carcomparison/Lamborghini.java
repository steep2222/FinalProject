
package carcomparison;

public class Lamborghini {
	
    private String name;
	
	public Lamborghini(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return getName();
	}
}