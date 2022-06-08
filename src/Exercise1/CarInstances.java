package Exercise1;

public class CarInstances {
    String carModel;
    int carGears;
    int carSpeed;
    String fuelType;

    public void DisplayAttributes(){
        System.out.println("Toyota " + carModel + " is the model of the car");
        System.out.println("The car has " + carGears + " gears");
        System.out.println("The car's maximum speed is " + carSpeed);
        System.out.println("The car uses " + fuelType + " for fuel");
    }
}
