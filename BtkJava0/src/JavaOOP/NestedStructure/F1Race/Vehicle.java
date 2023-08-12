package JavaOOP.NestedStructure.F1Race;

import JavaOOP.Controllers.ConsoleController;

public class Vehicle extends ConsoleController {
    private String name;
    private int maxSpeed;
    private Driver driver;
    private static int creationYear;

    public Vehicle(String name, int maxSpeed, int CreationYear, Driver driver) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.driver = driver;
        this.creationYear = CreationYear;
    }

    public void ShowData() {
        cwl("Vehicle Name :" + name);
        cwl("Max Speed:" + maxSpeed);
        cwl("Creation Year:" + creationYear);
        cwl("Driver :" + driver.getName());
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public Driver getDriver(){
        return driver;
    }

    /**
     * depended to X=V*T <br>
     * returns time as Seconds
     * @param distance
     * @param velocity
     * @return
     */
    public static float Calc_TimeForSpeed(float distance,float velocity) {
        return distance/velocity;
    }
}
