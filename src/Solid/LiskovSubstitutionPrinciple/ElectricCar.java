package Solid.LiskovSubstitutionPrinciple;

public class ElectricCar extends ElectricVehicle {
    
    @Override
    void recharge() {
        System.out.println("Recharging the electric car");
    }

    @Override
    void startEngine() {
        System.out.println("Starting the electric car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the electric car");
    }

    @Override
    void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

}
