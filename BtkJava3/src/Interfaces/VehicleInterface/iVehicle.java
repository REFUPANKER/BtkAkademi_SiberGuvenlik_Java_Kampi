package Interfaces.VehicleInterface;


public interface iVehicle {
    public VehicleStatus getStatus();
    public void setStatus(VehicleStatus status);

    public int getMaxSpeed();
    public void setMaxSpeed(int value);

    public int getWheelCount();

    public void write();

    enum VehicleStatus {
        Driveable,
        OutOfService,
    }
}
