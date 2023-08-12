package Polymorphysim.Shapes;

import java.util.Scanner;

public class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    @Override
    public double alan_hesap() {
        Scanner sc1 = new Scanner(System.in);
        double result = 0;
        System.out.print("Kenar :");
        double corner = sc1.nextDouble();
        sc1.nextLine();
        result=corner*corner;
        System.out.println("Alan :" + result);
        sc1.close();
        return result;
    }

    @Override
    public double cevre_hesap() {
        Scanner sc1 = new Scanner(System.in);
        double result = 0;
        System.out.print("Kenar :");
        double corner = sc1.nextDouble();
        result=corner*4;
        System.out.println("Çevre :" + result);
        sc1.close();
        return result;
    }
}
