package Com.tnsif.abstractionmethod;

//demo for abstraction

abstract class Delivery {//abstract class
	//abstract method
	abstract double calculatecharge (double distance);
	//concrete method
	void showDeliveryType() {
		System.out.println("Delivery service selected");
	}
}
class BikeDelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
}
class DroneDelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*20;
	}
	
}
public class Abstractionprogramm {
public static void main(String[] args) {
	BikeDelivery b = new BikeDelivery();
	System.out.println("Bike cahrge: "+b.calculatecharge(5));
	
	DroneDelivery d = new DroneDelivery();
	System.out.println("drone charge: "+d.calculatecharge(5));
	
}

}
