
package carcomparison;


public class Koenigsegg {
    private String name;
    private int horsePower;
    private int topSpeed;
    
    public Koenigsegg(String name, int horsePower, int topSpeed){
    this.name = name;
    this.horsePower = horsePower;
    this.topSpeed = topSpeed;
    }
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
        public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
}
