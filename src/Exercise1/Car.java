package Exercise1;

public class Car {
    public static void main (String [] args){
        //declaring a variable class and initializing
        CarInstances Toyota = new CarInstances();
        Toyota.carModel = "Corolla";
        Toyota.carGears = 6;
        Toyota.carSpeed = 340;
        Toyota.fuelType = "Diesel";

        Toyota.DisplayAttributes();
    }
}
