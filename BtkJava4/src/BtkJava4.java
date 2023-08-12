import CustomExceptions.DataAccessLimit;
import ExceptionHandling.TryCatch;
import java.util.Scanner;

public class BtkJava4 {
    public static void main(String[] args) {
        TryCatchM1();
    } private static void TryCatchM1() {
    try {
            Scanner sc1 = new Scanner(System.in);

            System.out.print("Num 1 :");
            long a = Long.parseLong(sc1.nextLine());

            System.out.print("Num 2 :");
            long b = Long.parseLong(sc1.nextLine());

            if (a >= 100 || b >= 100) {
                throw new DataAccessLimit();
            }

            System.out.println("num1/num2 : " + a / b);
            sc1.close();
        } catch (Exception e) {
            System.out.println("Exception thrown");
            System.out.println(e.getMessage());
        }}
}