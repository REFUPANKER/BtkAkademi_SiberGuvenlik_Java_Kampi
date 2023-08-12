package Polymorphysim.Shapes;

import java.util.Scanner;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public double alan_hesap() {
        Scanner sc1 = new Scanner(System.in);
        double result = 0;
        System.out.print("Radius :");
        double radius = sc1.nextDouble();
        sc1.nextLine();
        result = Math.PI * (radius * radius);
        System.out.println("Alan :" + result);
        sc1.close();
        return result;
    }

    @Override
    public double cevre_hesap() {
        Scanner sc1 = new Scanner(System.in);
        double result = 0;
        System.out.print("Radius :");
        double radius = sc1.nextDouble();
        sc1.nextLine();
        result = 2 * Math.PI * radius;
        System.out.println("Çevre :" + result);
        sc1.close();
        return result;
    }
}
