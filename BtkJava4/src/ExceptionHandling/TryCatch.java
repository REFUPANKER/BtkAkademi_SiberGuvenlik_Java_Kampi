package ExceptionHandling;

public class TryCatch {
    public static void ActInvoke(Runnable act) throws Exception {
        try {
            System.out.println("Action started");
            System.out.println("================================================\n");
            act.run();
        } catch (Exception e) {
            System.out.println("\n------------------Error Thrown------------------\n");
            System.out.println(e.getMessage());
            e.fillInStackTrace();
            for (var i : e.getStackTrace()) {
                System.out.println(i);
            }
        } finally {
            System.out.println("\n\n================================================");
            System.out.println("Ended");
        }
    }
}
