package Solid.LiskovSubstitutionPrinciple;

public class App {
    public static void main(String[] args) {
        FuelVehicle car = new PetrolCar();
        ElectricVehicle tesla = new ElectricCar();

        car.startEngine();
        car.move();
        car.stopEngine();
        car.refuel();

        tesla.startEngine();
        tesla.move();
        tesla.stopEngine();
        tesla.recharge();
    }
}
