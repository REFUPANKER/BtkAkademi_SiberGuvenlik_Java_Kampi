package JavaOOP.NestedStructure.F1Race;

import JavaOOP.Controllers.*;

import java.util.ArrayList;

public class F1race extends ConsoleController {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public F1race() {
        cwl("-> F1 Race : Vehicles and Drivers <-");
        vehicles.add(
                new Vehicle("FireWheel", 230, 2000,
                        new Driver("John", 20, 5) {
                            @Override
                            public String Celebration() {
                                return "I won the match";
                            }
                        })
        );
        vehicles.add(
                new Vehicle("Mustang", 270, 1998,
                        new Driver("Ryan Gosling", 12, 8) {
                            @Override
                            public String Celebration() {
                                return "i drive";
                            }
                        })
        );
        vehicles.add(
                new Vehicle("MrMissle", 170, 1997,
                        new Driver("Carl", 17, 5))
        );
        vehicles.add(
                new Vehicle("Skull", 150, 2002,
                        new Driver("Martin", 5, 5))
        );
        ListDrivers();
    }

    public void ListDrivers() {
        cwl("=========================");
        for (Vehicle i : vehicles) {
            i.ShowData();
            cwl("--- Celebration ---");
            cwl(i.getDriver().Celebration());
            cwl("Time on 100M :" + Vehicle.Calc_TimeForSpeed(100, i.getMaxSpeed()) + "s");
            cwl("=========================");
        }
    }
}
