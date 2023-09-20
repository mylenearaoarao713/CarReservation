package carreservation;

public class Car {
   String brand;
   String color;
public String getBrand() {
	return brand;
}
public Car(String brand, String color) {
	super();
	this.brand = brand;
	this.color = color;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
	System.out.println("Hello");
}


}
