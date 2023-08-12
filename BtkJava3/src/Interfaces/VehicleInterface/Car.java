package Interfaces.VehicleInterface;

public class Car implements iVehicle,iSpeedController{

    private int limit=0;
    private VehicleStatus status;


    @Override
    public VehicleStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(VehicleStatus status) {
        this.status=status;
    }

    @Override
    public int getMaxSpeed() {
        return limit;
    }

    @Override
    public void setMaxSpeed(int value) {
        limit=value;
    }

    @Override
    public int getWheelCount() {
        return 4;
    }

    @Override
    public void write() {
        System.out.println("this is vehicle");
        System.out.println("Wheel Count :"+getWheelCount());
        System.out.println("Max Speed :"+getMaxSpeed());
    }

    @Override
    public void setLimit(int value) {
        System.out.println("max speed set to 240");
        this.limit=value;
    }

    @Override
    public int readLimit() {
        return limit;
    }
}
