import Interfaces.PersonelManager.RegularWorker;
import Interfaces.VehicleInterface.ActionInvoker;
import Interfaces.VehicleInterface.Truck;

public class BtkJava3 {
    public static void main(String[] args) {
        //ActionInvoking();
        //iVehicleInterfaceTest();
        RegularWorker regularWorker = new RegularWorker();
        regularWorker.DisplayBankAccountData();
        regularWorker.addBudget(10000);
        regularWorker.DisplayBankAccountData();
    }

    private static void iVehicleInterfaceTest() {
        Truck tr1 = new Truck();
        tr1.write();
    }

    private static void ActionInvoking() {
        ActionInvoker actin = new ActionInvoker() {
            @Override
            public void run(Object... params) {
                System.out.println("test");
            }
        };
        actin.run("");
    }
}
