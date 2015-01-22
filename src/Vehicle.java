/**
 * @author Bhavin
 * @Description: Creating a vehicle class to use as a superclass
 * for all other vehicle subclass
 * @version 1.0 Vehicle Class is created with necessary properties and methods
 *
 */
public class Vehicle {

	//PRIVATE PROPERTIES #########################################
	private int numWheels = 4;
	private int numDoors = 2;
	private String color = "";
	private String make ="";
	private String model ="";
	private String year ="";
	private float speed = 0;
	private final int MAX_SPEED = 40;
	

	//GET ACCESSOR METHODS #######################################
	/**
	 * 
	 * @return numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * 
	 * @return numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}
	
	/**
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * 
	 * @return make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * 
	 * @return model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * 
	 * @return year
	 */
	public String getYear() {
		return this.year;
	}
	
	/**
	 * 
	 * @return speed
	 */
	public float getSpeed() {
		return this.speed;
	}
	
	public Vehicle(){
		
	}
	
	public void accelerate(){
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED){
			this.speed = this.MAX_SPEED;
		}
	}
	
	public void decelerate(){
		this.speed -= 6;
		if(this.speed < 0){
			this.speed = 0;
		}
	}
	
	public void turnLeft(){
		System.out.println("Turning Left");
	}
	
	public void turnRight(){
		System.out.println("Turning Right");
	}

}
