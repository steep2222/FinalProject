
package carcomparison;


public class Pagani {
	private String name;
	

	public Pagani(String name) {
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
